package com.easy.query.mssql.expression;

import com.easy.query.core.basic.jdbc.parameter.ToSQLContext;
import com.easy.query.core.common.KeywordTool;
import com.easy.query.core.expression.segment.builder.SQLBuilderSegment;
import com.easy.query.core.expression.segment.condition.PredicateSegment;
import com.easy.query.core.expression.sql.expression.EntityTableSQLExpression;
import com.easy.query.core.expression.sql.expression.impl.EntitySQLExpressionMetadata;
import com.easy.query.core.util.EasySQLExpressionUtil;
import com.easy.query.core.util.EasySQLSegmentUtil;

import java.util.Iterator;

/**
 * create time 2023/8/1 09:25
 * 文件说明
 *
 * @author xuejiaming
 */
public class MsSQLRowNumberQuerySQLExpression extends MsSQLQuerySQLExpression {
    public MsSQLRowNumberQuerySQLExpression(EntitySQLExpressionMetadata entitySQLExpressionMetadata) {
        super(entitySQLExpressionMetadata);
    }

    /**
     * 分页部分代码参考 FreeSQL https://github.com/dotnetcore/FreeSql
     *
     * @param toSQLContext
     * @return
     */
    @Override
    public String toSQL(ToSQLContext toSQLContext) {
        boolean root = EasySQLExpressionUtil.expressionInvokeRoot(toSQLContext);
        StringBuilder sql = new StringBuilder("SELECT ");
        if (this.distinct) {
            sql.append("DISTINCT ");
        }

        boolean useTop = offset <= 0 && rows > 0;
        if (useTop) {
            sql.append("TOP ").append(rows).append(" ");
        }
        sql.append(this.projects.toSQL(toSQLContext));


        Iterator<EntityTableSQLExpression> iterator = getTables().iterator();
        EntityTableSQLExpression firstTable = iterator.next();


        boolean hasOrderBy = this.order != null && this.order.isNotEmpty();
        boolean hasGroupBy = this.group != null && this.group.isNotEmpty();
        if (rows > 0 || offset > 0) {
            if (offset > 0) {// 注意这个判断，大于 0 才使用 ROW_NUMBER ，否则属于第一页直接使用 TOP
                sql.append(", ROW_NUMBER() OVER(");
                if (!hasOrderBy) {//top 1 不自动 order by
                    if (rows > 1 ) {
                        if (hasGroupBy) {
                            sql.append(" ORDER BY ").append(this.group.toSQL(toSQLContext));
                        } else {
                            SQLBuilderSegment columnOrder = getPrimaryKeyOrFirstColumnOrder(firstTable.getEntityTable());
                            sql.append(" ORDER BY ").append(columnOrder.toSQL(toSQLContext));
                        }
                    }
                } else {
                    sql.append(" ORDER BY ").append(this.order.toSQL(toSQLContext));
                }
                sql.append(" ) AS ").append(KeywordTool.ROW_NUM);
            }
        }

        sql.append(firstTable.toSQL(toSQLContext));
        while (iterator.hasNext()) {
            EntityTableSQLExpression table = iterator.next();
            sql.append(table.toSQL(toSQLContext));// [from table alias] | [left join table alias] 匿名表 应该使用  [left join (table) alias]

            PredicateSegment on = table.getOn();
            if (on != null && on.isNotEmpty()) {
                sql.append(" ON ").append(on.toSQL(toSQLContext));
            }
        }
        boolean notExistsSQL = EasySQLSegmentUtil.isNotEmpty(this.allPredicate);
        boolean hasWhere = EasySQLSegmentUtil.isNotEmpty(this.where);
        if (hasWhere) {
            String whereSQL = this.where.toSQL(toSQLContext);
            if (root && notExistsSQL) {
                sql.append(" WHERE ").append("( ").append(whereSQL).append(" )");
            } else {
                sql.append(" WHERE ").append(whereSQL);
            }
        }
        boolean onlyWhere = true;
        if (hasGroupBy) {
            onlyWhere = false;
            sql.append(" GROUP BY ").append(this.group.toSQL(toSQLContext));
            if (this.having != null && this.having.isNotEmpty()) {
                sql.append(" HAVING ").append(this.having.toSQL(toSQLContext));
            }
        }

        if (offset <= 0) {
            onlyWhere = false;
            if (hasOrderBy) {
                sql.append(" ORDER BY ").append(this.order.toSQL(toSQLContext));
            }
        } else {
            onlyWhere = false;
            sql.insert(0, "WITH rt AS ( ").append(" ) SELECT rt.* FROM rt where rt.__rownum__");
            if (rows > 0) {
                sql.append(" BETWEEN ").append(offset + 1).append(" AND ").append(offset + rows);
            } else {
                sql.append(" > ").append(offset);
            }
        }

        String resultSQL = sql.toString();
        if (root && notExistsSQL) {
            StringBuilder notExistsResultSQL = new StringBuilder("SELECT NOT EXISTS ( ");
            if (onlyWhere) {

                notExistsResultSQL.append(resultSQL).append(hasWhere ? " AND " : " WHERE ").append("( ").append(allPredicate.toSQL(toSQLContext))
                        .append(" )").append(" )");
            } else {
                notExistsResultSQL.append("SELECT 1 FROM ( ").append(resultSQL).append(" ) t ").append(" WHERE ").append(allPredicate.toSQL(toSQLContext))
                        .append(" )");
            }
            return notExistsResultSQL.toString();
        } else {
            return resultSQL;
        }
    }
}
