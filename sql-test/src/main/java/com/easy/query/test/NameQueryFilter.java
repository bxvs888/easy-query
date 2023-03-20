package com.easy.query.test;

import com.easy.query.core.interceptor.GlobalPredicateFilterInterceptor;
import com.easy.query.core.expression.lambda.Property;
import com.easy.query.core.expression.parser.abstraction.SqlPredicate;
import com.easy.query.core.query.SqlEntityExpression;
import com.easy.query.core.util.EasyUtil;

/**
 * @FileName: NameQueryFilter.java
 * @Description: 文件说明
 * @Date: 2023/3/8 10:24
 * @Created by xuejiaming
 */
public class NameQueryFilter implements GlobalPredicateFilterInterceptor {
    @Override
    public void configure(Class<?> entityClass, SqlEntityExpression sqlEntityExpression, SqlPredicate<Object> sqlPredicate) {
        Property<Object,?> property = EasyUtil.getPropertyLambda(entityClass, "name", String.class);
        sqlPredicate.isNull(property);
    }

    @Override
    public String name() {
        return "nameQueryFilter";
    }

    @Override
    public boolean apply(Class<?> entityClass) {
        return TestUserMysql.class.equals(entityClass);
    }
}
