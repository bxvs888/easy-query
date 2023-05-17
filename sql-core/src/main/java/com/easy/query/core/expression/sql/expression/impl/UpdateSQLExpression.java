package com.easy.query.core.expression.sql.expression.impl;

import com.easy.query.core.abstraction.EasyQueryRuntimeContext;
import com.easy.query.core.basic.jdbc.parameter.SQLParameterCollector;
import com.easy.query.core.expression.sql.expression.factory.EasyExpressionFactory;
import com.easy.query.core.expression.segment.builder.SQLBuilderSegment;
import com.easy.query.core.expression.segment.builder.UpdateSetSQLBuilderSegment;
import com.easy.query.core.expression.segment.condition.AndPredicateSegment;
import com.easy.query.core.expression.segment.condition.PredicateSegment;
import com.easy.query.core.expression.sql.expression.EasyTableSQLExpression;
import com.easy.query.core.expression.sql.expression.EasyUpdateSQLExpression;
import com.easy.query.core.util.SQLExpressionUtil;
import com.easy.query.core.util.SQLSegmentUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * create time 2023/4/22 22:49
 * 文件说明
 *
 * @author xuejiaming
 */
public  class UpdateSQLExpression implements EasyUpdateSQLExpression {
    protected final EasyQueryRuntimeContext runtimeContext;
    protected final SQLBuilderSegment setColumns;
    protected final PredicateSegment where;
    protected final List<EasyTableSQLExpression> tables=new ArrayList<>(1);

    public UpdateSQLExpression(EasyQueryRuntimeContext runtimeContext, EasyTableSQLExpression table) {
        this.runtimeContext = runtimeContext;
        this.tables.add(table);
        this.setColumns = new UpdateSetSQLBuilderSegment();
        this.where = new AndPredicateSegment(true);
    }

    @Override
    public SQLBuilderSegment getSetColumns() {
        return setColumns;
    }

    @Override
    public PredicateSegment getWhere() {
        return where;
    }
//
//    @Override
//    public EasyTableSqlExpression getTable() {
//        return table;
//    }


    @Override
    public List<EasyTableSQLExpression> getTables() {
        return tables;
    }

    @Override
    public EasyQueryRuntimeContext getRuntimeContext() {
        return runtimeContext;
    }


    @Override
    public String toSQL(SQLParameterCollector sqlParameterCollector) {
        SQLExpressionUtil.expressionInvokeRoot(sqlParameterCollector);
        if(SQLSegmentUtil.isEmpty(setColumns)){
            return null;
        }
        EasyTableSQLExpression easyTableSQLExpression = tables.get(0);
        String tableName = easyTableSQLExpression.getTableName();
        return "UPDATE " + tableName + " SET " + setColumns.toSQL(sqlParameterCollector) + " WHERE " +
                where.toSQL(sqlParameterCollector);
    }

    @Override
    public EasyUpdateSQLExpression cloneSQLExpression() {

        EasyExpressionFactory expressionFactory = runtimeContext.getExpressionFactory();
        EasyUpdateSQLExpression easyUpdateSQLExpression = expressionFactory.createEasyUpdateSQLExpression(runtimeContext,tables.get(0).cloneSQLExpression());
        if(SQLSegmentUtil.isNotEmpty(where)){
            where.copyTo(easyUpdateSQLExpression.getWhere());
        }if(SQLSegmentUtil.isNotEmpty(setColumns)){
            setColumns.copyTo(easyUpdateSQLExpression.getSetColumns());
        }
        return easyUpdateSQLExpression;
    }
}
