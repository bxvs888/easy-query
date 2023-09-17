package com.easy.query.api4kt.update.abstraction;

import com.easy.query.api4kt.update.KtExpressionUpdatable;
import com.easy.query.core.basic.api.update.ClientExpressionUpdatable;
import com.easy.query.core.expression.sql.builder.EntityUpdateExpressionBuilder;

import java.util.function.Function;

/**
 * @author xuejiaming
 * @FileName: AbstractExpressionUpdate.java
 * @Description: 文件说明
 * @Date: 2023/2/25 08:24
 */
public abstract class AbstractKtExpressionUpdatable<T> implements KtExpressionUpdatable<T> {
    protected final ClientExpressionUpdatable<T> clientExpressionUpdatable;

    public AbstractKtExpressionUpdatable(ClientExpressionUpdatable<T> expressionObjectUpdatable) {
        this.clientExpressionUpdatable = expressionObjectUpdatable;
    }

    @Override
    public EntityUpdateExpressionBuilder getEntityUpdateExpressionBuilder() {
        return clientExpressionUpdatable.getEntityUpdateExpressionBuilder();
    }

    @Override
    public ClientExpressionUpdatable<T> getClientUpdate() {
        return clientExpressionUpdatable;
    }

    @Override
    public long executeRows() {
        return clientExpressionUpdatable.executeRows();
    }

    @Override
    public KtExpressionUpdatable<T> withVersion(boolean condition, Object versionValue) {
        if (condition) {
            clientExpressionUpdatable.withVersion(versionValue);
        }
        return this;
    }

    @Override
    public KtExpressionUpdatable<T> asTable(Function<String, String> tableNameAs) {
        clientExpressionUpdatable.asTable(tableNameAs);
        return this;
    }

    @Override
    public KtExpressionUpdatable<T> asSchema(Function<String, String> schemaAs) {
        clientExpressionUpdatable.asSchema(schemaAs);
        return this;
    }

    @Override
    public KtExpressionUpdatable<T> asAlias(String alias) {
        clientExpressionUpdatable.asAlias(alias);
        return this;
    }

    @Override
    public KtExpressionUpdatable<T> noInterceptor() {
        clientExpressionUpdatable.noInterceptor();
        return this;
    }

    @Override
    public KtExpressionUpdatable<T> useInterceptor(String name) {
        clientExpressionUpdatable.useInterceptor(name);
        return this;
    }

    @Override
    public KtExpressionUpdatable<T> noInterceptor(String name) {
        clientExpressionUpdatable.noInterceptor(name);
        return this;
    }

    @Override
    public KtExpressionUpdatable<T> useInterceptor() {
        clientExpressionUpdatable.useInterceptor();
        return this;
    }

    @Override
    public KtExpressionUpdatable<T> useLogicDelete(boolean enable) {
        clientExpressionUpdatable.useLogicDelete(enable);
        return this;
    }

    @Override
    public void executeRows(long expectRows, String msg, String code) {
        clientExpressionUpdatable.executeRows(expectRows, msg, code);
    }

    @Override
    public KtExpressionUpdatable<T> noVersionError() {
        clientExpressionUpdatable.noVersionError();
        return this;
    }

    @Override
    public KtExpressionUpdatable<T> noVersionIgnore() {
        clientExpressionUpdatable.noVersionIgnore();
        return this;
    }

    @Override
    public KtExpressionUpdatable<T> batch(boolean use) {
        clientExpressionUpdatable.batch(use);
        return this;
    }

    @Override
    public KtExpressionUpdatable<T> asTableLink(Function<String, String> linkAs) {
        clientExpressionUpdatable.asTableLink(linkAs);
        return this;
    }
}
