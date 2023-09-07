package com.easy.query.api.proxy.select.extension.queryable;

import com.easy.query.api.proxy.select.ProxyQueryable;
import com.easy.query.api.proxy.sql.ProxyOrderSelector;
import com.easy.query.core.api.dynamic.sort.ObjectSort;
import com.easy.query.core.exception.EasyQueryOrderByInvalidOperationException;
import com.easy.query.core.expression.lambda.SQLExpression2;
import com.easy.query.core.expression.lambda.SQLFuncExpression1;
import com.easy.query.core.proxy.ProxyEntity;
import com.easy.query.core.proxy.SQLColumn;

/**
 * create time 2023/8/16 08:50
 * 文件说明
 *
 * @author xuejiaming
 */
public interface ProxyOrderable1<T1Proxy extends ProxyEntity<T1Proxy, T1>, T1> {


    default ProxyQueryable<T1Proxy, T1> orderByAsc(SQLExpression2<ProxyOrderSelector, T1Proxy> selectExpression) {
        return orderByAsc(true, selectExpression);
    }

    default ProxyQueryable<T1Proxy, T1> orderByAsc(boolean condition, SQLExpression2<ProxyOrderSelector, T1Proxy> selectExpression) {
        return orderBy(condition, selectExpression, true);
    }

    default ProxyQueryable<T1Proxy, T1> orderByDesc(SQLExpression2<ProxyOrderSelector, T1Proxy> selectExpression) {
        return orderByDesc(true, selectExpression);
    }

    default ProxyQueryable<T1Proxy, T1> orderByDesc(boolean condition, SQLExpression2<ProxyOrderSelector, T1Proxy> selectExpression) {
        return orderBy(condition, selectExpression, false);
    }

    default ProxyQueryable<T1Proxy, T1> orderBy(SQLExpression2<ProxyOrderSelector, T1Proxy> selectExpression, boolean asc) {
        return orderBy(true, selectExpression, asc);
    }

    ProxyQueryable<T1Proxy, T1> orderBy(boolean condition, SQLExpression2<ProxyOrderSelector, T1Proxy> selectExpression, boolean asc);

    default ProxyQueryable<T1Proxy, T1> orderByAsc(SQLFuncExpression1<T1Proxy, SQLColumn<?>> selectExpression) {
        return orderByAsc(true, selectExpression);
    }

    default ProxyQueryable<T1Proxy, T1> orderByAsc(boolean condition, SQLFuncExpression1<T1Proxy, SQLColumn<?>> selectExpression) {
        return orderBy(true, selectExpression, true);
    }

    default ProxyQueryable<T1Proxy, T1> orderByDesc(SQLFuncExpression1<T1Proxy, SQLColumn<?>> selectExpression) {
        return orderByDesc(true, selectExpression);
    }

    default ProxyQueryable<T1Proxy, T1> orderByDesc(boolean condition, SQLFuncExpression1<T1Proxy, SQLColumn<?>> selectExpression) {
        return orderBy(true, selectExpression, false);
    }

    ProxyQueryable<T1Proxy, T1> orderBy(boolean condition, SQLFuncExpression1<T1Proxy, SQLColumn<?>> selectExpression, boolean asc);

    /**
     * @param configuration
     * @return
     * @throws EasyQueryOrderByInvalidOperationException 当配置{@link ObjectSort} 为{@code  DynamicModeEnum.STRICT}排序设置的属性不存在当前排序对象里面或者当前查询对象无法获取
     */
    default ProxyQueryable<T1Proxy, T1> orderByObject(ObjectSort configuration) {
        return orderByObject(true, configuration);
    }

    /**
     * @param condition
     * @param objectSort
     * @return
     * @throws EasyQueryOrderByInvalidOperationException 当配置{@link ObjectSort} 为{@code  DynamicModeEnum.STRICT}排序设置的属性不存在当前排序对象里面或者当前查询对象无法获取
     */
    ProxyQueryable<T1Proxy, T1> orderByObject(boolean condition, ObjectSort objectSort);

}
