package com.easy.query.api.proxy.select.extension.queryable5;

import com.easy.query.api.proxy.select.ProxyQueryable5;
import com.easy.query.api.proxy.sql.ProxyAggregateFilter;
import com.easy.query.api.proxy.sql.impl.ProxyAggregateFilterImpl;
import com.easy.query.core.common.tuple.Tuple5;
import com.easy.query.core.expression.lambda.SQLExpression2;
import com.easy.query.core.expression.lambda.SQLExpression6;
import com.easy.query.core.proxy.ProxyEntity;

/**
 * create time 2023/8/16 08:49
 * 文件说明
 *
 * @author xuejiaming
 */
public interface ProxyHavingable5<T1Proxy extends ProxyEntity<T1Proxy, T1>, T1,
        T2Proxy extends ProxyEntity<T2Proxy, T2>, T2,
        T3Proxy extends ProxyEntity<T3Proxy, T3>, T3,
        T4Proxy extends ProxyEntity<T4Proxy, T4>, T4,
        T5Proxy extends ProxyEntity<T5Proxy, T5>, T5> extends ClientProxyQueryable5Available<T1, T2, T3, T4, T5>, ProxyQueryable5Available<T1Proxy, T1, T2Proxy, T2, T3Proxy, T3, T4Proxy, T4, T5Proxy, T5> {

    default ProxyQueryable5<T1Proxy, T1, T2Proxy, T2, T3Proxy, T3, T4Proxy, T4, T5Proxy, T5> having(SQLExpression6<ProxyAggregateFilter, T1Proxy, T2Proxy, T3Proxy, T4Proxy, T5Proxy> predicateExpression) {
        return having(true, predicateExpression);
    }

    default ProxyQueryable5<T1Proxy, T1, T2Proxy, T2, T3Proxy, T3, T4Proxy, T4, T5Proxy, T5> having(boolean condition, SQLExpression6<ProxyAggregateFilter, T1Proxy, T2Proxy, T3Proxy, T4Proxy, T5Proxy> predicateExpression) {
        if (condition) {
            getClientQueryable5().having((t, t1, t2, t3, t4) -> {
                predicateExpression.apply(new ProxyAggregateFilterImpl(t.getAggregateFilter()), get1Proxy(), get2Proxy(), get3Proxy(), get4Proxy(), get5Proxy());
            });
        }
        return getQueryable5();
    }

    default ProxyQueryable5<T1Proxy, T1, T2Proxy, T2, T3Proxy, T3, T4Proxy, T4, T5Proxy, T5> havingMerge(SQLExpression2<ProxyAggregateFilter, Tuple5<T1Proxy, T2Proxy, T3Proxy, T4Proxy, T5Proxy>> predicateExpression) {
        return havingMerge(true, predicateExpression);
    }

    default ProxyQueryable5<T1Proxy, T1, T2Proxy, T2, T3Proxy, T3, T4Proxy, T4, T5Proxy, T5> havingMerge(boolean condition, SQLExpression2<ProxyAggregateFilter, Tuple5<T1Proxy, T2Proxy, T3Proxy, T4Proxy, T5Proxy>> predicateExpression) {
        return having(condition, (filter, t, t1, t2, t3, t4) -> {
            predicateExpression.apply(filter, new Tuple5<>(t, t1, t2, t3, t4));
        });
    }

}
