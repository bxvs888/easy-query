package com.easy.query.api.proxy.sql;

import com.easy.query.api.proxy.select.ProxyQueryable;
import com.easy.query.api.proxy.select.impl.EasyProxyQueryable;
import com.easy.query.core.basic.api.select.ClientQueryable;
import com.easy.query.core.expression.parser.core.base.NavigateInclude;
import com.easy.query.core.proxy.ProxyEntity;
import com.easy.query.core.proxy.SQLColumn;

import java.util.Collection;

/**
 * create time 2023/6/18 11:14
 * 文件说明
 *
 * @author xuejiaming
 */
public interface ProxyNavigateInclude<T1> {
    NavigateInclude<T1> getNavigateInclude();
   default <TPropertyProxy extends ProxyEntity<TPropertyProxy, TProperty>, TProperty> ProxyQueryable<TPropertyProxy,TProperty> one(SQLColumn<TProperty> navigate,TPropertyProxy tPropertyProxy){
       return  one(navigate,tPropertyProxy,null);
   }
   default <TPropertyProxy extends ProxyEntity<TPropertyProxy, TProperty>, TProperty> ProxyQueryable<TPropertyProxy,TProperty> one(SQLColumn<TProperty> navigate,TPropertyProxy tPropertyProxy,Integer groupSize){
       ClientQueryable<TProperty> clientQueryable = getNavigateInclude().with(navigate.value(),groupSize);
       return new EasyProxyQueryable<>(tPropertyProxy,clientQueryable);
   }
   default  <TPropertyProxy extends ProxyEntity<TPropertyProxy, TProperty>, TProperty> ProxyQueryable<TPropertyProxy,TProperty> many(SQLColumn<Collection<TProperty>> navigate,TPropertyProxy tPropertyProxy){
       return many(navigate,tPropertyProxy,null);
   }
   default  <TPropertyProxy extends ProxyEntity<TPropertyProxy, TProperty>, TProperty> ProxyQueryable<TPropertyProxy,TProperty> many(SQLColumn<Collection<TProperty>> navigate,TPropertyProxy tPropertyProxy,Integer groupSize){
       ClientQueryable<TProperty> clientQueryable = getNavigateInclude().<TProperty>with(navigate.value(), groupSize);
       return new EasyProxyQueryable<>(tPropertyProxy,clientQueryable);
   }
}
