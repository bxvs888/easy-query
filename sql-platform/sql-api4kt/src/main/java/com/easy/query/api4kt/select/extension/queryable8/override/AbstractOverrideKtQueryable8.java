package com.easy.query.api4kt.select.extension.queryable8.override;

import com.easy.query.api4kt.select.KtQueryable;
import com.easy.query.api4kt.select.KtQueryable8;
import com.easy.query.api4kt.select.abstraction.AbstractKtQueryable;
import com.easy.query.api4kt.select.extension.queryable8.KtQueryable8Available;
import com.easy.query.api4kt.sql.SQLKtGroupBySelector;
import com.easy.query.api4kt.sql.SQLKtNavigateInclude;
import com.easy.query.api4kt.sql.SQLKtOrderBySelector;
import com.easy.query.api4kt.sql.SQLKtWhereAggregatePredicate;
import com.easy.query.api4kt.sql.SQLKtWherePredicate;
import com.easy.query.core.api.dynamic.sort.ObjectSort;
import com.easy.query.core.basic.api.select.ClientQueryable8;
import com.easy.query.core.enums.sharding.ConnectionModeEnum;
import com.easy.query.core.expression.builder.core.ConditionAccepter;
import com.easy.query.core.expression.lambda.SQLExpression1;
import com.easy.query.core.expression.lambda.SQLFuncExpression1;

import java.util.Collection;
import java.util.function.Function;

/**
 * create time 2023/8/16 07:52
 * 文件说明
 *
 * @author xuejiaming
 */
public abstract class AbstractOverrideKtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> extends AbstractKtQueryable<T1> implements KtQueryable8Available<T1, T2, T3, T4, T5, T6, T7, T8> {

    protected final ClientQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> entityQueryable8;

    public AbstractOverrideKtQueryable8(ClientQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> entityQueryable8) {
        super(entityQueryable8);
        this.entityQueryable8 = entityQueryable8;
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> orderBy(boolean condition, SQLExpression1<SQLKtOrderBySelector<T1>> selectExpression, boolean asc) {
        super.orderBy(condition, selectExpression, asc);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> orderByObject(boolean condition, ObjectSort configuration) {
        super.orderByObject(condition, configuration);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> whereById(boolean condition, Object id) {
        super.whereById(condition, id);
        return getQueryable8();
    }

    @Override
    public <TProperty> KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> whereByIds(boolean condition, Collection<TProperty> ids) {
        super.whereByIds(condition, ids);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> whereObject(boolean condition, Object object) {
        super.whereObject(condition, object);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> where(boolean condition, SQLExpression1<SQLKtWherePredicate<T1>> whereExpression) {
        super.where(condition, whereExpression);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> groupBy(boolean condition, SQLExpression1<SQLKtGroupBySelector<T1>> selectExpression) {
        super.groupBy(condition, selectExpression);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> having(boolean condition, SQLExpression1<SQLKtWhereAggregatePredicate<T1>> predicateExpression) {
        super.having(condition, predicateExpression);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> orderByAsc(boolean condition, SQLExpression1<SQLKtOrderBySelector<T1>> selectExpression) {
        super.orderByAsc(condition, selectExpression);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> orderByDesc(boolean condition, SQLExpression1<SQLKtOrderBySelector<T1>> selectExpression) {
        super.orderByDesc(condition, selectExpression);
        return getQueryable8();
    }

    @Override
    public <TREntity> KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> include(boolean condition, SQLFuncExpression1<SQLKtNavigateInclude<T1>, KtQueryable<TREntity>> navigateIncludeSQLExpression) {
        super.include(condition, navigateIncludeSQLExpression);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> limit(boolean condition, long offset, long rows) {
        super.limit(condition, offset, rows);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> distinct(boolean condition) {
        super.distinct(condition);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> disableLogicDelete() {
        super.disableLogicDelete();
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> enableLogicDelete() {
        super.enableLogicDelete();
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> useLogicDelete(boolean enable) {
        super.useLogicDelete(enable);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> noInterceptor() {
        super.noInterceptor();
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> useInterceptor(String name) {
        super.useInterceptor(name);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> noInterceptor(String name) {
        super.noInterceptor(name);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> useInterceptor() {
        super.useInterceptor();
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> asTracking() {
        super.asTracking();
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> asNoTracking() {
        super.asNoTracking();
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> queryLargeColumn(boolean queryLarge) {
        super.queryLargeColumn(queryLarge);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> useShardingConfigure(int maxShardingQueryLimit, ConnectionModeEnum connectionMode) {
        super.useShardingConfigure(maxShardingQueryLimit, connectionMode);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> useMaxShardingQueryLimit(int maxShardingQueryLimit) {
        super.useMaxShardingQueryLimit(maxShardingQueryLimit);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> useConnectionMode(ConnectionModeEnum connectionMode) {
        super.useConnectionMode(connectionMode);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> asTable(Function<String, String> tableNameAs) {
        super.asTable(tableNameAs);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> asSchema(Function<String, String> schemaAs) {
        super.asSchema(schemaAs);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> asAlias(String alias) {
        super.asAlias(alias);
        return getQueryable8();
    }

    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> asTableLink(Function<String, String> linkAs) {
        super.asTableLink(linkAs);
        return getQueryable8();
    }
    @Override
    public KtQueryable8<T1, T2, T3, T4, T5, T6, T7, T8> conditionConfigure(ConditionAccepter conditionAccepter) {
        super.conditionConfigure(conditionAccepter);
        return getQueryable8();
    }
}
