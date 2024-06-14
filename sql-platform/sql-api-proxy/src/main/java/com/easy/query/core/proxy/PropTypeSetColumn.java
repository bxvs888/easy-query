package com.easy.query.core.proxy;

/**
 * create time 2023/12/18 22:48
 * 文件说明
 *
 * @author xuejiaming
 */
public interface PropTypeSetColumn<TProperty> extends SQLSelectAsExpression, PropTypeAvailable {
    <TR> void _setPropertyType(Class<TR> clazz);

    <TR> PropTypeSetColumn<? extends TR> asAnyType(Class<TR> clazz);

    /**
     * 使用asType
     *
     * @param clazz
     * @param <TR>
     * @return
     */
    @Deprecated
    default <TR> PropTypeSetColumn<? extends TR> setPropertyType(Class<TR> clazz) {
        return asAnyType(clazz);
    }
}
