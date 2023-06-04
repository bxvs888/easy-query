package com.easy.query.api4kt.select;

import com.easy.query.api4kt.sql.SQLKtColumnAsSelector;
import com.easy.query.api4kt.sql.SQLKtColumnResultSelector;
import com.easy.query.api4kt.sql.SQLKtColumnSelector;
import com.easy.query.api4kt.sql.SQLKtGroupBySelector;
import com.easy.query.api4kt.sql.SQLKtWherePredicate;
import com.easy.query.core.api.client.EasyQueryClient;
import com.easy.query.core.enums.sharding.ConnectionModeEnum;
import com.easy.query.core.expression.lambda.SQLExpression1;
import com.easy.query.core.expression.lambda.SQLExpression4;

import java.math.BigDecimal;
import java.util.function.Function;

/**
 * @author xuejiaming
 * @FileName: Queryable4.java
 * @Description: 文件说明
 * @Date: 2023/3/9 12:10
 */
public interface KtQueryable4<T1, T2, T3, T4> extends KtQueryable<T1> {
    //region where
    default KtQueryable4<T1, T2, T3, T4> whereObject(Object object) {
        return whereObject(true, object);
    }

    KtQueryable4<T1, T2, T3, T4> whereObject(boolean condition, Object object);

    @Override
    default KtQueryable4<T1, T2, T3, T4> where(SQLExpression1<SQLKtWherePredicate<T1>> whereExpression) {
        return where(true, whereExpression);
    }

    @Override
    KtQueryable4<T1, T2, T3, T4> where(boolean condition, SQLExpression1<SQLKtWherePredicate<T1>> whereExpression);

    default KtQueryable4<T1, T2, T3, T4> where(SQLExpression4<SQLKtWherePredicate<T1>, SQLKtWherePredicate<T2>, SQLKtWherePredicate<T3>, SQLKtWherePredicate<T4>> whereExpression) {
        return where(true, whereExpression);
    }

    KtQueryable4<T1, T2, T3, T4> where(boolean condition, SQLExpression4<SQLKtWherePredicate<T1>, SQLKtWherePredicate<T2>, SQLKtWherePredicate<T3>, SQLKtWherePredicate<T4>> whereExpression);

    //endregion
    //region select
    <TR> KtQueryable<TR> select(Class<TR> resultClass, SQLExpression4<SQLKtColumnAsSelector<T1, TR>, SQLKtColumnAsSelector<T2, TR>, SQLKtColumnAsSelector<T3, TR>, SQLKtColumnAsSelector<T4, TR>> selectExpression);
    //endregion

    //region aggregate

    /**
     * 防止溢出
     *
     * @param columnSelectorExpression
     * @param <TMember>
     * @return
     */
    default <TMember extends Number> BigDecimal sumBigDecimalOrNull(SQLExpression4<SQLKtColumnResultSelector<T1, TMember>, SQLKtColumnResultSelector<T2, TMember>, SQLKtColumnResultSelector<T3, TMember>, SQLKtColumnResultSelector<T4, TMember>> columnSelectorExpression) {
        return sumBigDecimalOrDefault(columnSelectorExpression, null);
    }

    /**
     * 防止溢出
     *
     * @param columnSelectorExpression
     * @param <TMember>
     * @return
     */
    default <TMember extends Number> BigDecimal sumBigDecimalNotNull(SQLExpression4<SQLKtColumnResultSelector<T1, TMember>, SQLKtColumnResultSelector<T2, TMember>, SQLKtColumnResultSelector<T3, TMember>, SQLKtColumnResultSelector<T4, TMember>> columnSelectorExpression) {
        return sumBigDecimalOrDefault(columnSelectorExpression, BigDecimal.ZERO);
    }

    <TMember extends Number> BigDecimal sumBigDecimalOrDefault(SQLExpression4<SQLKtColumnResultSelector<T1, TMember>, SQLKtColumnResultSelector<T2, TMember>, SQLKtColumnResultSelector<T3, TMember>, SQLKtColumnResultSelector<T4, TMember>> columnSelectorExpression, BigDecimal def);

    default <TMember extends Number> TMember sumOrNull(SQLExpression4<SQLKtColumnResultSelector<T1, TMember>, SQLKtColumnResultSelector<T2, TMember>, SQLKtColumnResultSelector<T3, TMember>, SQLKtColumnResultSelector<T4, TMember>> columnSelectorExpression) {
        return sumOrDefault(columnSelectorExpression, null);
    }

    <TMember extends Number> TMember sumOrDefault(SQLExpression4<SQLKtColumnResultSelector<T1, TMember>, SQLKtColumnResultSelector<T2, TMember>, SQLKtColumnResultSelector<T3, TMember>, SQLKtColumnResultSelector<T4, TMember>> columnSelectorExpression, TMember def);

    default <TMember> TMember maxOrNull(SQLExpression4<SQLKtColumnResultSelector<T1, TMember>, SQLKtColumnResultSelector<T2, TMember>, SQLKtColumnResultSelector<T3, TMember>, SQLKtColumnResultSelector<T4, TMember>> columnSelectorExpression) {
        return maxOrDefault(columnSelectorExpression, null);
    }

    <TMember> TMember maxOrDefault(SQLExpression4<SQLKtColumnResultSelector<T1, TMember>, SQLKtColumnResultSelector<T2, TMember>, SQLKtColumnResultSelector<T3, TMember>, SQLKtColumnResultSelector<T4, TMember>> columnSelectorExpression, TMember def);

    default <TMember> TMember minOrNull(SQLExpression4<SQLKtColumnResultSelector<T1, TMember>, SQLKtColumnResultSelector<T2, TMember>, SQLKtColumnResultSelector<T3, TMember>, SQLKtColumnResultSelector<T4, TMember>> columnSelectorExpression) {
        return minOrDefault(columnSelectorExpression, null);
    }

    <TMember> TMember minOrDefault(SQLExpression4<SQLKtColumnResultSelector<T1, TMember>, SQLKtColumnResultSelector<T2, TMember>, SQLKtColumnResultSelector<T3, TMember>, SQLKtColumnResultSelector<T4, TMember>> columnSelectorExpression, TMember def);

    default <TMember> TMember avgOrNull(SQLExpression4<SQLKtColumnResultSelector<T1, TMember>, SQLKtColumnResultSelector<T2, TMember>, SQLKtColumnResultSelector<T3, TMember>, SQLKtColumnResultSelector<T4, TMember>> columnSelectorExpression) {
        return avgOrDefault(columnSelectorExpression, null);
    }

    <TMember> TMember avgOrDefault(SQLExpression4<SQLKtColumnResultSelector<T1, TMember>, SQLKtColumnResultSelector<T2, TMember>, SQLKtColumnResultSelector<T3, TMember>, SQLKtColumnResultSelector<T4, TMember>> columnSelectorExpression, TMember def);

    default Integer lenOrNull(SQLExpression4<SQLKtColumnResultSelector<T1, ?>, SQLKtColumnResultSelector<T2, ?>, SQLKtColumnResultSelector<T3, ?>, SQLKtColumnResultSelector<T4, ?>> columnSelectorExpression) {
        return lenOrDefault(columnSelectorExpression, null);
    }

    Integer lenOrDefault(SQLExpression4<SQLKtColumnResultSelector<T1, ?>, SQLKtColumnResultSelector<T2, ?>, SQLKtColumnResultSelector<T3, ?>, SQLKtColumnResultSelector<T4, ?>> columnSelectorExpression, Integer def);
    //endregion


    //region group
    @Override
    default KtQueryable4<T1, T2, T3, T4> groupBy(SQLExpression1<SQLKtGroupBySelector<T1>> selectExpression) {
        return groupBy(true, selectExpression);
    }

    @Override
    KtQueryable4<T1, T2, T3, T4> groupBy(boolean condition, SQLExpression1<SQLKtGroupBySelector<T1>> selectExpression);

    default KtQueryable4<T1, T2, T3, T4> groupBy(SQLExpression4<SQLKtGroupBySelector<T1>, SQLKtGroupBySelector<T2>, SQLKtGroupBySelector<T3>, SQLKtGroupBySelector<T4>> selectExpression) {
        return groupBy(true, selectExpression);
    }

    KtQueryable4<T1, T2, T3, T4> groupBy(boolean condition, SQLExpression4<SQLKtGroupBySelector<T1>, SQLKtGroupBySelector<T2>, SQLKtGroupBySelector<T3>, SQLKtGroupBySelector<T4>> selectExpression);

    //endregion
    //region order
    @Override
    default KtQueryable4<T1, T2, T3, T4> orderByAsc(SQLExpression1<SQLKtColumnSelector<T1>> selectExpression) {
        return orderByAsc(true, selectExpression);
    }

    @Override
    KtQueryable4<T1, T2, T3, T4> orderByAsc(boolean condition, SQLExpression1<SQLKtColumnSelector<T1>> selectExpression);

    default KtQueryable4<T1, T2, T3, T4> orderByAsc(SQLExpression4<SQLKtColumnSelector<T1>, SQLKtColumnSelector<T2>, SQLKtColumnSelector<T3>, SQLKtColumnSelector<T4>> selectExpression) {
        return orderByAsc(true, selectExpression);
    }

    KtQueryable4<T1, T2, T3, T4> orderByAsc(boolean condition, SQLExpression4<SQLKtColumnSelector<T1>, SQLKtColumnSelector<T2>, SQLKtColumnSelector<T3>, SQLKtColumnSelector<T4>> selectExpression);

    @Override
    default KtQueryable4<T1, T2, T3, T4> orderByDesc(SQLExpression1<SQLKtColumnSelector<T1>> selectExpression) {
        return orderByDesc(true, selectExpression);
    }

    @Override
    KtQueryable4<T1, T2, T3, T4> orderByDesc(boolean condition, SQLExpression1<SQLKtColumnSelector<T1>> selectExpression);

    default KtQueryable4<T1, T2, T3, T4> orderByDesc(SQLExpression4<SQLKtColumnSelector<T1>, SQLKtColumnSelector<T2>, SQLKtColumnSelector<T3>, SQLKtColumnSelector<T4>> selectExpression) {
        return orderByDesc(true, selectExpression);
    }

    KtQueryable4<T1, T2, T3, T4> orderByDesc(boolean condition, SQLExpression4<SQLKtColumnSelector<T1>, SQLKtColumnSelector<T2>, SQLKtColumnSelector<T3>, SQLKtColumnSelector<T4>> selectExpression);
    //endregion
    //region limit

    @Override
    default KtQueryable4<T1, T2, T3, T4> limit(long rows) {
        return limit(true, rows);
    }

    @Override
    default KtQueryable4<T1, T2, T3, T4> limit(boolean condition, long rows) {
        return limit(condition, 0, rows);
    }

    @Override
    default KtQueryable4<T1, T2, T3, T4> limit(long offset, long rows) {
        return limit(true, offset, rows);
    }

    @Override
    KtQueryable4<T1, T2, T3, T4> limit(boolean condition, long offset, long rows);

    default KtQueryable4<T1, T2, T3, T4> distinct() {
        return distinct(true);
    }

    KtQueryable4<T1, T2, T3, T4> distinct(boolean condition);
    //endregion

    @Override
    KtQueryable4<T1, T2, T3, T4> disableLogicDelete();

    @Override
    KtQueryable4<T1, T2, T3, T4> enableLogicDelete();

    @Override
    KtQueryable4<T1, T2, T3, T4> useLogicDelete(boolean enable);

    @Override
    KtQueryable4<T1, T2, T3, T4> noInterceptor();

    @Override
    KtQueryable4<T1, T2, T3, T4> useInterceptor();

    /**
     * 自动将查询结果集合全部添加到当前上下文追踪中,如果当前查询结果十分庞大,并且更新数据只有个别条数,建议不要使用
     * 追踪查询，可以通过开启追踪后使用普通的查询，然后添加到当前的追踪上下文中{@link EasyQueryClient#addTracking(Object)},开始先数据追踪的差异更新
     *
     * @return
     */
    @Override
    KtQueryable4<T1, T2, T3, T4> asTracking();

    @Override
    KtQueryable4<T1, T2, T3, T4> asNoTracking();

    @Override
    KtQueryable4<T1, T2, T3, T4> queryLargeColumn(boolean queryLarge);

    @Override
    KtQueryable4<T1, T2, T3, T4> useShardingConfigure(int maxShardingQueryLimit, ConnectionModeEnum connectionMode);

    @Override
    KtQueryable4<T1, T2, T3, T4> useMaxShardingQueryLimit(int maxShardingQueryLimit);

    @Override
    KtQueryable4<T1, T2, T3, T4> useConnectionMode(ConnectionModeEnum connectionMode);

    /**
     * 将当前表达式最近的一张表的表名修改成 {@param tableName}
     * 如果当前最近的表是正常的数据库表名,那么直接将表名改写
     * 如果当前最近的表是匿名表比如嵌套queryable的表那么将alias改成对应的表名
     *
     * @param tableName
     * @return
     */
    @Override
    default KtQueryable4<T1, T2, T3, T4> asTable(String tableName) {
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
    KtQueryable4<T1, T2, T3, T4> asTable(Function<String, String> tableNameAs);


    @Override
    default KtQueryable4<T1, T2, T3, T4> asSchema(String tableName) {
        return asSchema(old -> tableName);
    }

    @Override
    KtQueryable4<T1, T2, T3, T4> asSchema(Function<String, String> schemaAs);

    @Override
    KtQueryable4<T1, T2, T3, T4> asAlias(String alias);
}
