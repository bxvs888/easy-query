package com.easy.query.test.entity.school.proxy;

import com.easy.query.core.proxy.AbstractProxyEntity;
import com.easy.query.core.proxy.SQLSelectAsExpression;
import com.easy.query.core.proxy.columns.types.SQLStringTypeColumn;
import com.easy.query.core.proxy.fetcher.AbstractFetcher;
import com.easy.query.test.entity.school.SchoolStudent;

/**
 * this file automatically generated by easy-query, don't modify it
 * 当前文件是easy-query自动生成的请不要随意修改
 * 如果出现属性冲突请使用@ProxyProperty进行重命名
 *
 * @author easy-query
 */
public class SchoolStudentProxy extends AbstractProxyEntity<SchoolStudentProxy, SchoolStudent> {

    private static final Class<SchoolStudent> entityClass = SchoolStudent.class;

    public static final SchoolStudentProxy TABLE = createTable().createEmpty();

    public static SchoolStudentProxy createTable() {
        return new SchoolStudentProxy();
    }

    public SchoolStudentProxy() {
    }

    /**
     * {@link SchoolStudent#getId}
     */
    public SQLStringTypeColumn<SchoolStudentProxy> id() {
        return getStringTypeColumn("id");
    }

    /**
     * {@link SchoolStudent#getClassId}
     */
    public SQLStringTypeColumn<SchoolStudentProxy> classId() {
        return getStringTypeColumn("classId");
    }

    /**
     * {@link SchoolStudent#getName}
     */
    public SQLStringTypeColumn<SchoolStudentProxy> name() {
        return getStringTypeColumn("name");
    }

    /**
     * private Integer age;
     * {@link SchoolStudent#getSchoolClass}
     */
    public com.easy.query.test.entity.school.proxy.SchoolClassProxy schoolClass() {
        return getNavigate("schoolClass", new com.easy.query.test.entity.school.proxy.SchoolClassProxy());
    }

    /**
     * {@link SchoolStudent#getSchoolStudentAddress}
     */
    public com.easy.query.test.entity.school.proxy.SchoolStudentAddressProxy schoolStudentAddress() {
        return getNavigate("schoolStudentAddress", new com.easy.query.test.entity.school.proxy.SchoolStudentAddressProxy());
    }


    @Override
    public Class<SchoolStudent> getEntityClass() {
        return entityClass;
    }


    /**
     * 数据库列的简单获取
     *
     * @return
     */
    public SchoolStudentProxyFetcher FETCHER = new SchoolStudentProxyFetcher(this, null, SQLSelectAsExpression.empty);


    public static class SchoolStudentProxyFetcher extends AbstractFetcher<SchoolStudentProxy, SchoolStudent, SchoolStudentProxyFetcher> {

        public SchoolStudentProxyFetcher(SchoolStudentProxy proxy, SchoolStudentProxyFetcher prev, SQLSelectAsExpression sqlSelectAsExpression) {
            super(proxy, prev, sqlSelectAsExpression);
        }


        /**
         * {@link SchoolStudent#getId}
         */
        public SchoolStudentProxyFetcher id() {
            return add(getProxy().id());
        }

        /**
         * {@link SchoolStudent#getClassId}
         */
        public SchoolStudentProxyFetcher classId() {
            return add(getProxy().classId());
        }

        /**
         * {@link SchoolStudent#getName}
         */
        public SchoolStudentProxyFetcher name() {
            return add(getProxy().name());
        }


        @Override
        protected SchoolStudentProxyFetcher createFetcher(SchoolStudentProxy cp, AbstractFetcher<SchoolStudentProxy, SchoolStudent, SchoolStudentProxyFetcher> prev, SQLSelectAsExpression sqlSelectExpression) {
            return new SchoolStudentProxyFetcher(cp, this, sqlSelectExpression);
        }
    }

}
