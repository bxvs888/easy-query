package com.easy.query.test.entity.school.dto.proxy;

import com.easy.query.core.expression.parser.core.available.TableAvailable;
import com.easy.query.core.proxy.AbstractProxyEntity;
import com.easy.query.core.proxy.SQLColumn;
import com.easy.query.core.proxy.SQLSelectAsExpression;
import com.easy.query.core.proxy.fetcher.AbstractFetcher;
import com.easy.query.core.proxy.core.EntitySQLContext;
import com.easy.query.test.entity.school.dto.SchoolClass1VO;
import com.easy.query.core.proxy.columns.types.SQLStringTypeColumn;
import com.easy.query.core.proxy.columns.SQLNavigateColumn;
import com.easy.query.core.proxy.columns.SQLQueryable;
import com.easy.query.core.proxy.columns.types.SQLAnyTypeColumn;

/**
 * this file automatically generated by easy-query, don't modify it
 * 当前文件是easy-query自动生成的请不要随意修改
 * 如果出现属性冲突请使用@ProxyProperty进行重命名
 *
 * @author easy-query
 */
public class SchoolClass1VOProxy extends AbstractProxyEntity<SchoolClass1VOProxy, SchoolClass1VO> {

    private static final Class<SchoolClass1VO> entityClass = SchoolClass1VO.class;

    public static SchoolClass1VOProxy createTable() {
        return new SchoolClass1VOProxy();
    }

    public SchoolClass1VOProxy() {
    }

    /**
     * {@link SchoolClass1VO#getId}
     */
    public SQLStringTypeColumn<SchoolClass1VOProxy> id() {
        return getStringTypeColumn("id");
    }

    /**
     * {@link SchoolClass1VO#getName}
     */
    public SQLStringTypeColumn<SchoolClass1VOProxy> name() {
        return getStringTypeColumn("name");
    }

    /**
     * {@link SchoolClass1VO#getName1}
     */
    public SQLStringTypeColumn<SchoolClass1VOProxy> name1() {
        return getStringTypeColumn("name1");
    }

    /**
     * {@link SchoolClass1VO#getSchoolStudents}
     */
    public SQLQueryable<com.easy.query.test.entity.school.dto.proxy.SchoolStudentVOProxy, com.easy.query.test.entity.school.dto.SchoolStudentVO> schoolStudents() {
        return getNavigates("schoolStudents", new com.easy.query.test.entity.school.dto.proxy.SchoolStudentVOProxy());
    }


    @Override
    public Class<SchoolClass1VO> getEntityClass() {
        return entityClass;
    }


    /**
     * 数据库列的简单获取
     *
     * @return
     */
    public SchoolClass1VOProxyFetcher FETCHER = new SchoolClass1VOProxyFetcher(this, null, SQLSelectAsExpression.empty);


    public static class SchoolClass1VOProxyFetcher extends AbstractFetcher<SchoolClass1VOProxy, SchoolClass1VO, SchoolClass1VOProxyFetcher> {

        public SchoolClass1VOProxyFetcher(SchoolClass1VOProxy proxy, SchoolClass1VOProxyFetcher prev, SQLSelectAsExpression sqlSelectAsExpression) {
            super(proxy, prev, sqlSelectAsExpression);
        }


        /**
         * {@link SchoolClass1VO#getId}
         */
        public SchoolClass1VOProxyFetcher id() {
            return add(getProxy().id());
        }

        /**
         * {@link SchoolClass1VO#getName}
         */
        public SchoolClass1VOProxyFetcher name() {
            return add(getProxy().name());
        }

        /**
         * {@link SchoolClass1VO#getName1}
         */
        public SchoolClass1VOProxyFetcher name1() {
            return add(getProxy().name1());
        }


        @Override
        protected SchoolClass1VOProxyFetcher createFetcher(SchoolClass1VOProxy cp, AbstractFetcher<SchoolClass1VOProxy, SchoolClass1VO, SchoolClass1VOProxyFetcher> prev, SQLSelectAsExpression sqlSelectExpression) {
            return new SchoolClass1VOProxyFetcher(cp, this, sqlSelectExpression);
        }
    }

}
