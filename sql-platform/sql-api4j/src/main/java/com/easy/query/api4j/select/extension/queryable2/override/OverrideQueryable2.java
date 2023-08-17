package com.easy.query.api4j.select.extension.queryable2.override;

import com.easy.query.api4j.select.Queryable;
import com.easy.query.api4j.select.Queryable2;
import com.easy.query.api4j.select.extension.queryable2.Queryable2Available;
import com.easy.query.api4j.sql.SQLGroupBySelector;
import com.easy.query.api4j.sql.SQLNavigateInclude;
import com.easy.query.api4j.sql.SQLOrderBySelector;
import com.easy.query.api4j.sql.SQLWhereAggregatePredicate;
import com.easy.query.api4j.sql.SQLWherePredicate;
import com.easy.query.core.api.client.EasyQueryClient;
import com.easy.query.core.enums.sharding.ConnectionModeEnum;
import com.easy.query.core.expression.lambda.SQLExpression1;
import com.easy.query.core.expression.lambda.SQLFuncExpression1;

import java.util.Collection;
import java.util.function.Function;

/**
 * create time 2023/8/16 08:12
 * 文件说明
 *
 * @author xuejiaming
 */
public interface OverrideQueryable2<T1, T2> extends Queryable<T1>, Queryable2Available<T1, T2> {

    @Override
    Queryable2<T1,T2> cloneQueryable();

    @Override
    default Queryable2<T1, T2> whereById(Object id) {
        return whereById(true, id);
    }

    @Override
    Queryable2<T1, T2> whereById(boolean condition, Object id);

    @Override
    <TProperty> Queryable2<T1, T2> whereByIds(boolean condition, Collection<TProperty> ids);

    /**
     * 仅支持主表的动态对象查询
     *
     * @param object 对象查询的对象
     * @return
     */
    @Override
    default Queryable2<T1, T2> whereObject(Object object) {
        return whereObject(true, object);
    }

    /**
     * 仅支持主表的动态对象查询
     *
     * @param condition 是否使用对象查询
     * @param object    对象查询的对象
     * @return
     */
    @Override
    Queryable2<T1, T2> whereObject(boolean condition, Object object);


    @Override
    default Queryable2<T1, T2> where(SQLExpression1<SQLWherePredicate<T1>> whereExpression) {
        return where(true, whereExpression);
    }

    @Override
    Queryable2<T1, T2> where(boolean condition, SQLExpression1<SQLWherePredicate<T1>> whereExpression);

    @Override
    default Queryable2<T1, T2> groupBy(SQLExpression1<SQLGroupBySelector<T1>> selectExpression) {
        return groupBy(true, selectExpression);
    }

    @Override
    Queryable2<T1, T2> groupBy(boolean condition, SQLExpression1<SQLGroupBySelector<T1>> selectExpression);

    @Override
    default Queryable2<T1, T2> having(SQLExpression1<SQLWhereAggregatePredicate<T1>> predicateExpression) {
        return having(true, predicateExpression);
    }

    @Override
    Queryable2<T1, T2> having(boolean condition, SQLExpression1<SQLWhereAggregatePredicate<T1>> predicateExpression);

    @Override
    default Queryable2<T1, T2> orderByAsc(SQLExpression1<SQLOrderBySelector<T1>> selectExpression) {
        return orderByAsc(true, selectExpression);
    }

    @Override
    Queryable2<T1, T2> orderByAsc(boolean condition, SQLExpression1<SQLOrderBySelector<T1>> selectExpression);

    @Override
    default Queryable2<T1, T2> orderByDesc(SQLExpression1<SQLOrderBySelector<T1>> selectExpression) {
        return orderByDesc(true, selectExpression);
    }

    @Override
    Queryable2<T1, T2> orderByDesc(boolean condition, SQLExpression1<SQLOrderBySelector<T1>> selectExpression);

    @Override
    default <TREntity> Queryable2<T1, T2> include(SQLFuncExpression1<SQLNavigateInclude<T1>, Queryable<TREntity>> navigateIncludeSQLExpression) {
        return include(true, navigateIncludeSQLExpression);
    }

    @Override
    <TREntity> Queryable2<T1, T2> include(boolean condition, SQLFuncExpression1<SQLNavigateInclude<T1>, Queryable<TREntity>> navigateIncludeSQLExpression);

    @Override
    default Queryable2<T1, T2> limit(long rows) {
        return limit(true, rows);
    }

    @Override
    default Queryable2<T1, T2> limit(boolean condition, long rows) {
        return limit(condition, 0, rows);
    }

    @Override
    default Queryable2<T1, T2> limit(long offset, long rows) {
        return limit(true, offset, rows);
    }

    @Override
    Queryable2<T1, T2> limit(boolean condition, long offset, long rows);

    default Queryable2<T1, T2> distinct() {
        return distinct(true);
    }

    @Override
    Queryable2<T1, T2> distinct(boolean condition);

    @Override
    Queryable2<T1, T2> disableLogicDelete();

    @Override
    Queryable2<T1, T2> enableLogicDelete();

    @Override
    Queryable2<T1, T2> useLogicDelete(boolean enable);

    @Override
    Queryable2<T1, T2> noInterceptor();

    @Override
    Queryable2<T1, T2> useInterceptor(String name);

    @Override
    Queryable2<T1, T2> noInterceptor(String name);

    @Override
    Queryable2<T1, T2> useInterceptor();

    /**
     * 自动将查询结果集合全部添加到当前上下文追踪中,如果当前查询结果十分庞大,并且更新数据只有个别条数,建议不要使用
     * 追踪查询，可以通过开启追踪后使用普通的查询，然后添加到当前的追踪上下文中{@link EasyQueryClient#addTracking(Object)},开始先数据追踪的差异更新
     *
     * @return
     */
    @Override
    Queryable2<T1, T2> asTracking();

    @Override
    Queryable2<T1, T2> asNoTracking();

    @Override
    Queryable2<T1, T2> queryLargeColumn(boolean queryLarge);

    @Override
    Queryable2<T1, T2> useShardingConfigure(int maxShardingQueryLimit, ConnectionModeEnum connectionMode);

    @Override
    Queryable2<T1, T2> useMaxShardingQueryLimit(int maxShardingQueryLimit);

    @Override
    Queryable2<T1, T2> useConnectionMode(ConnectionModeEnum connectionMode);

    /**
     * 将当前表达式最近的一张表的表名修改成 {@param tableName}
     * 如果当前最近的表是正常的数据库表名,那么直接将表名改写
     * 如果当前最近的表是匿名表比如嵌套queryable的表那么将alias改成对应的表名
     *
     * @param tableName
     * @return
     */
    @Override
    default Queryable2<T1, T2> asTable(String tableName) {
        return asTable(old -> tableName);
    }

    /**
     * 将当前表达式最近的一张表的表名修改成 {@param tableNameAs}返回的表名
     * 如果当前最近的表是正常的数据库表名,那么直接将表名改写
     * 如果当前最近的表是匿名表比如嵌套queryable的表那么将alias改成对应的表名
     *
     * @param tableNameAs
     * @return
     */
    @Override
    Queryable2<T1, T2> asTable(Function<String, String> tableNameAs);

    @Override
    default Queryable2<T1, T2> asSchema(String schema) {
        return asSchema(old -> schema);
    }

    @Override
    Queryable2<T1, T2> asSchema(Function<String, String> schemaAs);

    @Override
    Queryable2<T1, T2> asAlias(String alias);

    /**
     * @param linkAs 别名 FROM | LEFT JOIN | RIGHT JOIN
     * @return
     */
    @Override
    default Queryable2<T1, T2> asTableLink(String linkAs) {
        return asTableLink(o -> linkAs);
    }


    @Override
    Queryable2<T1, T2> asTableLink(Function<String, String> linkAs);
}
