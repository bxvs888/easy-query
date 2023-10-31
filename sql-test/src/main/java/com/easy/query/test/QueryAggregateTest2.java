package com.easy.query.test;

import com.easy.query.api4j.select.Queryable10;
import com.easy.query.api4j.select.Queryable3;
import com.easy.query.api4j.select.Queryable4;
import com.easy.query.api4j.select.Queryable5;
import com.easy.query.api4j.select.Queryable6;
import com.easy.query.api4j.select.Queryable7;
import com.easy.query.api4j.select.Queryable8;
import com.easy.query.api4j.select.Queryable9;
import com.easy.query.core.exception.EasyQuerySQLCommandException;
import com.easy.query.core.exception.EasyQuerySQLStatementException;
import com.easy.query.test.entity.Topic;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.function.Supplier;

/**
 * create time 2023/10/31 08:11
 * 文件说明
 *
 * @author xuejiaming
 */
public class QueryAggregateTest2 extends BaseTest{

    public Queryable10<Topic, Topic, Topic, Topic, Topic, Topic, Topic, Topic, Topic, Topic> join1(){
        Queryable10<Topic, Topic, Topic, Topic, Topic, Topic, Topic, Topic, Topic, Topic> query = easyQuery.queryable(Topic.class)
                .rightJoin(Topic.class, (t, t1) -> t.eq(t1, Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t2(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t3(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t4(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t5(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t6(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t7(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t8(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t9(), Topic::getId, Topic::getId));
        return query;
    }
    public Queryable9<Topic, Topic, Topic, Topic, Topic, Topic, Topic, Topic, Topic> join2(){
        Queryable9<Topic, Topic, Topic, Topic, Topic, Topic, Topic, Topic, Topic> query = easyQuery.queryable(Topic.class)
                .rightJoin(Topic.class, (t, t1) -> t.eq(t1, Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t2(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t3(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t4(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t5(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t6(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t7(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t8(), Topic::getId, Topic::getId));
        return query;
    }
    public Queryable8<Topic, Topic, Topic, Topic, Topic, Topic, Topic, Topic> join3(){
        Queryable8<Topic, Topic, Topic, Topic, Topic, Topic, Topic, Topic> query = easyQuery.queryable(Topic.class)
                .rightJoin(Topic.class, (t, t1) -> t.eq(t1, Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t2(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t3(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t4(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t5(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t6(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t7(), Topic::getId, Topic::getId));
        return query;
    }
    public Queryable7<Topic, Topic, Topic, Topic, Topic, Topic, Topic> join4(){
        Queryable7<Topic, Topic, Topic, Topic, Topic, Topic, Topic> query = easyQuery.queryable(Topic.class)
                .rightJoin(Topic.class, (t, t1) -> t.eq(t1, Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t2(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t3(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t4(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t5(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t6(), Topic::getId, Topic::getId));
        return query;
    }
    public Queryable6<Topic, Topic, Topic, Topic, Topic, Topic> join5(){
        Queryable6<Topic, Topic, Topic, Topic, Topic, Topic> query = easyQuery.queryable(Topic.class)
                .rightJoin(Topic.class, (t, t1) -> t.eq(t1, Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t2(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t3(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t4(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t5(), Topic::getId, Topic::getId));
        return query;
    }
    public  Queryable5<Topic, Topic, Topic, Topic, Topic> join6(){
        Queryable5<Topic, Topic, Topic, Topic, Topic> query = easyQuery.queryable(Topic.class)
                .rightJoin(Topic.class, (t, t1) -> t.eq(t1, Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t2(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t3(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t4(), Topic::getId, Topic::getId));
        return query;
    }
    public Queryable4<Topic, Topic, Topic, Topic> join7(){
        Queryable4<Topic, Topic, Topic, Topic> query = easyQuery.queryable(Topic.class)
                .rightJoin(Topic.class, (t, t1) -> t.eq(t1, Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t2(), Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t3(), Topic::getId, Topic::getId));
        return query;
    }
    public Queryable3<Topic, Topic, Topic> join8(){
        Queryable3<Topic, Topic, Topic> query = easyQuery.queryable(Topic.class)
                .rightJoin(Topic.class, (t, t1) -> t.eq(t1, Topic::getId, Topic::getId))
                .rightJoinMerge(Topic.class, o -> o.t().eq(o.t2(), Topic::getId, Topic::getId));
        return query;
    }

    @Test
    public void test1(){
        {
            Supplier<Exception> f = () -> {
                try {
                    join1().asTable("abcv").sumOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `t_topic` t8 ON t.`id` = t8.`id` RIGHT JOIN `abcv` t9 ON t.`id` = t9.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join1().asTable("abcv").sumOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `t_topic` t8 ON t.`id` = t8.`id` RIGHT JOIN `abcv` t9 ON t.`id` = t9.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join1().asTable("abcv").sumBigDecimalOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    }, BigDecimal.ZERO);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `t_topic` t8 ON t.`id` = t8.`id` RIGHT JOIN `abcv` t9 ON t.`id` = t9.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join1().asTable("abcv").sumBigDecimalOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `t_topic` t8 ON t.`id` = t8.`id` RIGHT JOIN `abcv` t9 ON t.`id` = t9.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join1().asTable("abcv").maxOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MAX(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `t_topic` t8 ON t.`id` = t8.`id` RIGHT JOIN `abcv` t9 ON t.`id` = t9.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join1().asTable("abcv").maxOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MAX(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `t_topic` t8 ON t.`id` = t8.`id` RIGHT JOIN `abcv` t9 ON t.`id` = t9.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join1().asTable("abcv").minOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MIN(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `t_topic` t8 ON t.`id` = t8.`id` RIGHT JOIN `abcv` t9 ON t.`id` = t9.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join1().asTable("abcv").minOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MIN(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `t_topic` t8 ON t.`id` = t8.`id` RIGHT JOIN `abcv` t9 ON t.`id` = t9.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join1().asTable("abcv").avgOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `t_topic` t8 ON t.`id` = t8.`id` RIGHT JOIN `abcv` t9 ON t.`id` = t9.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join1().asTable("abcv").avgBigDecimalOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `t_topic` t8 ON t.`id` = t8.`id` RIGHT JOIN `abcv` t9 ON t.`id` = t9.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join1().asTable("abcv").avgFloatOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `t_topic` t8 ON t.`id` = t8.`id` RIGHT JOIN `abcv` t9 ON t.`id` = t9.`id`",sql);
        }

        {
            Supplier<Exception> f = () -> {
                try {
                    join1().asTable("abcv").avgOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1d);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `t_topic` t8 ON t.`id` = t8.`id` RIGHT JOIN `abcv` t9 ON t.`id` = t9.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join1().asTable("abcv").avgBigDecimalOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },BigDecimal.ZERO);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `t_topic` t8 ON t.`id` = t8.`id` RIGHT JOIN `abcv` t9 ON t.`id` = t9.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join1().asTable("abcv").avgFloatOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1f);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `t_topic` t8 ON t.`id` = t8.`id` RIGHT JOIN `abcv` t9 ON t.`id` = t9.`id`",sql);
        }

    }
    @Test
    public void test2(){
        {
            Supplier<Exception> f = () -> {
                try {
                    join2().asTable("abcv").sumOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `abcv` t8 ON t.`id` = t8.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join2().asTable("abcv").sumOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `abcv` t8 ON t.`id` = t8.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join2().asTable("abcv").sumBigDecimalOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    }, BigDecimal.ZERO);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `abcv` t8 ON t.`id` = t8.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join2().asTable("abcv").sumBigDecimalOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `abcv` t8 ON t.`id` = t8.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join2().asTable("abcv").maxOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MAX(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `abcv` t8 ON t.`id` = t8.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join2().asTable("abcv").maxOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MAX(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `abcv` t8 ON t.`id` = t8.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join2().asTable("abcv").minOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MIN(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `abcv` t8 ON t.`id` = t8.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join2().asTable("abcv").minOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MIN(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `abcv` t8 ON t.`id` = t8.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join2().asTable("abcv").avgOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `abcv` t8 ON t.`id` = t8.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join2().asTable("abcv").avgBigDecimalOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `abcv` t8 ON t.`id` = t8.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join2().asTable("abcv").avgFloatOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `abcv` t8 ON t.`id` = t8.`id`",sql);
        }

        {
            Supplier<Exception> f = () -> {
                try {
                    join2().asTable("abcv").avgOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1d);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `abcv` t8 ON t.`id` = t8.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join2().asTable("abcv").avgBigDecimalOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },BigDecimal.ZERO);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `abcv` t8 ON t.`id` = t8.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join2().asTable("abcv").avgFloatOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1f);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `t_topic` t7 ON t.`id` = t7.`id` RIGHT JOIN `abcv` t8 ON t.`id` = t8.`id`",sql);
        }

    }

    @Test
    public void test3(){
        {
            Supplier<Exception> f = () -> {
                try {
                    join3().asTable("abcv").sumOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `abcv` t7 ON t.`id` = t7.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join3().asTable("abcv").sumOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `abcv` t7 ON t.`id` = t7.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join3().asTable("abcv").sumBigDecimalOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    }, BigDecimal.ZERO);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `abcv` t7 ON t.`id` = t7.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join3().asTable("abcv").sumBigDecimalOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `abcv` t7 ON t.`id` = t7.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join3().asTable("abcv").maxOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MAX(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `abcv` t7 ON t.`id` = t7.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join3().asTable("abcv").maxOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MAX(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `abcv` t7 ON t.`id` = t7.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join3().asTable("abcv").minOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MIN(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `abcv` t7 ON t.`id` = t7.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join3().asTable("abcv").minOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MIN(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `abcv` t7 ON t.`id` = t7.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join3().asTable("abcv").avgOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `abcv` t7 ON t.`id` = t7.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join3().asTable("abcv").avgBigDecimalOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `abcv` t7 ON t.`id` = t7.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join3().asTable("abcv").avgFloatOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `abcv` t7 ON t.`id` = t7.`id`",sql);
        }

        {
            Supplier<Exception> f = () -> {
                try {
                    join3().asTable("abcv").avgOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1d);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `abcv` t7 ON t.`id` = t7.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join3().asTable("abcv").avgBigDecimalOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },BigDecimal.ZERO);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `abcv` t7 ON t.`id` = t7.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join3().asTable("abcv").avgFloatOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1f);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `t_topic` t6 ON t.`id` = t6.`id` RIGHT JOIN `abcv` t7 ON t.`id` = t7.`id`",sql);
        }

    }

    @Test
    public void test4(){
        {
            Supplier<Exception> f = () -> {
                try {
                    join4().asTable("abcv").sumOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `abcv` t6 ON t.`id` = t6.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join4().asTable("abcv").sumOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `abcv` t6 ON t.`id` = t6.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join4().asTable("abcv").sumBigDecimalOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    }, BigDecimal.ZERO);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `abcv` t6 ON t.`id` = t6.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join4().asTable("abcv").sumBigDecimalOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `abcv` t6 ON t.`id` = t6.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join4().asTable("abcv").maxOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MAX(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `abcv` t6 ON t.`id` = t6.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join4().asTable("abcv").maxOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MAX(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `abcv` t6 ON t.`id` = t6.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join4().asTable("abcv").minOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MIN(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `abcv` t6 ON t.`id` = t6.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join4().asTable("abcv").minOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MIN(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `abcv` t6 ON t.`id` = t6.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join4().asTable("abcv").avgOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `abcv` t6 ON t.`id` = t6.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join4().asTable("abcv").avgBigDecimalOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `abcv` t6 ON t.`id` = t6.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join4().asTable("abcv").avgFloatOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `abcv` t6 ON t.`id` = t6.`id`",sql);
        }

        {
            Supplier<Exception> f = () -> {
                try {
                    join4().asTable("abcv").avgOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1d);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `abcv` t6 ON t.`id` = t6.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join4().asTable("abcv").avgBigDecimalOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },BigDecimal.ZERO);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `abcv` t6 ON t.`id` = t6.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join4().asTable("abcv").avgFloatOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1f);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `t_topic` t5 ON t.`id` = t5.`id` RIGHT JOIN `abcv` t6 ON t.`id` = t6.`id`",sql);
        }

    }
    @Test
    public void test5(){
        {
            Supplier<Exception> f = () -> {
                try {
                    join5().asTable("abcv").sumOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `abcv` t5 ON t.`id` = t5.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join5().asTable("abcv").sumOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `abcv` t5 ON t.`id` = t5.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join5().asTable("abcv").sumBigDecimalOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    }, BigDecimal.ZERO);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `abcv` t5 ON t.`id` = t5.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join5().asTable("abcv").sumBigDecimalOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `abcv` t5 ON t.`id` = t5.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join5().asTable("abcv").maxOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MAX(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `abcv` t5 ON t.`id` = t5.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join5().asTable("abcv").maxOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MAX(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `abcv` t5 ON t.`id` = t5.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join5().asTable("abcv").minOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MIN(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `abcv` t5 ON t.`id` = t5.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join5().asTable("abcv").minOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MIN(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `abcv` t5 ON t.`id` = t5.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join5().asTable("abcv").avgOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `abcv` t5 ON t.`id` = t5.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join5().asTable("abcv").avgBigDecimalOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `abcv` t5 ON t.`id` = t5.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join5().asTable("abcv").avgFloatOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `abcv` t5 ON t.`id` = t5.`id`",sql);
        }

        {
            Supplier<Exception> f = () -> {
                try {
                    join5().asTable("abcv").avgOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1d);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `abcv` t5 ON t.`id` = t5.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join5().asTable("abcv").avgBigDecimalOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },BigDecimal.ZERO);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `abcv` t5 ON t.`id` = t5.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join5().asTable("abcv").avgFloatOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1f);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `t_topic` t4 ON t.`id` = t4.`id` RIGHT JOIN `abcv` t5 ON t.`id` = t5.`id`",sql);
        }

    }
    @Test
    public void test6(){
        {
            Supplier<Exception> f = () -> {
                try {
                    join6().asTable("abcv").sumOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `abcv` t4 ON t.`id` = t4.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join6().asTable("abcv").sumOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `abcv` t4 ON t.`id` = t4.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join6().asTable("abcv").sumBigDecimalOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    }, BigDecimal.ZERO);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `abcv` t4 ON t.`id` = t4.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join6().asTable("abcv").sumBigDecimalOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `abcv` t4 ON t.`id` = t4.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join6().asTable("abcv").maxOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MAX(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `abcv` t4 ON t.`id` = t4.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join6().asTable("abcv").maxOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MAX(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `abcv` t4 ON t.`id` = t4.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join6().asTable("abcv").minOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MIN(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `abcv` t4 ON t.`id` = t4.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join6().asTable("abcv").minOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MIN(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `abcv` t4 ON t.`id` = t4.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join6().asTable("abcv").avgOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `abcv` t4 ON t.`id` = t4.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join6().asTable("abcv").avgBigDecimalOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `abcv` t4 ON t.`id` = t4.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join6().asTable("abcv").avgFloatOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `abcv` t4 ON t.`id` = t4.`id`",sql);
        }

        {
            Supplier<Exception> f = () -> {
                try {
                    join6().asTable("abcv").avgOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1d);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `abcv` t4 ON t.`id` = t4.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join6().asTable("abcv").avgBigDecimalOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },BigDecimal.ZERO);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `abcv` t4 ON t.`id` = t4.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join6().asTable("abcv").avgFloatOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1f);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `t_topic` t3 ON t.`id` = t3.`id` RIGHT JOIN `abcv` t4 ON t.`id` = t4.`id`",sql);
        }

    }
    @Test
    public void test7(){
        {
            Supplier<Exception> f = () -> {
                try {
                    join7().asTable("abcv").sumOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `abcv` t3 ON t.`id` = t3.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join7().asTable("abcv").sumOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `abcv` t3 ON t.`id` = t3.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join7().asTable("abcv").sumBigDecimalOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    }, BigDecimal.ZERO);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `abcv` t3 ON t.`id` = t3.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join7().asTable("abcv").sumBigDecimalOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `abcv` t3 ON t.`id` = t3.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join7().asTable("abcv").maxOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MAX(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `abcv` t3 ON t.`id` = t3.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join7().asTable("abcv").maxOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MAX(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `abcv` t3 ON t.`id` = t3.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join7().asTable("abcv").minOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MIN(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `abcv` t3 ON t.`id` = t3.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join7().asTable("abcv").minOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MIN(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `abcv` t3 ON t.`id` = t3.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join7().asTable("abcv").avgOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `abcv` t3 ON t.`id` = t3.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join7().asTable("abcv").avgBigDecimalOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `abcv` t3 ON t.`id` = t3.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join7().asTable("abcv").avgFloatOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `abcv` t3 ON t.`id` = t3.`id`",sql);
        }

        {
            Supplier<Exception> f = () -> {
                try {
                    join7().asTable("abcv").avgOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1d);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `abcv` t3 ON t.`id` = t3.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join7().asTable("abcv").avgBigDecimalOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },BigDecimal.ZERO);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `abcv` t3 ON t.`id` = t3.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join7().asTable("abcv").avgFloatOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1f);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `t_topic` t2 ON t.`id` = t2.`id` RIGHT JOIN `abcv` t3 ON t.`id` = t3.`id`",sql);
        }

    }
    @Test
    public void test8(){
        {
            Supplier<Exception> f = () -> {
                try {
                    join8().asTable("abcv").sumOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `abcv` t2 ON t.`id` = t2.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join8().asTable("abcv").sumOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `abcv` t2 ON t.`id` = t2.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join8().asTable("abcv").sumBigDecimalOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    }, BigDecimal.ZERO);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `abcv` t2 ON t.`id` = t2.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join8().asTable("abcv").sumBigDecimalOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT SUM(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `abcv` t2 ON t.`id` = t2.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join8().asTable("abcv").maxOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MAX(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `abcv` t2 ON t.`id` = t2.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join8().asTable("abcv").maxOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MAX(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `abcv` t2 ON t.`id` = t2.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join8().asTable("abcv").minOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MIN(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `abcv` t2 ON t.`id` = t2.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join8().asTable("abcv").minOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT MIN(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `abcv` t2 ON t.`id` = t2.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join8().asTable("abcv").avgOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `abcv` t2 ON t.`id` = t2.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join8().asTable("abcv").avgBigDecimalOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `abcv` t2 ON t.`id` = t2.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join8().asTable("abcv").avgFloatOrNullMerge(o->{
                        o.t().column(Topic::getStars);
                    });
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `abcv` t2 ON t.`id` = t2.`id`",sql);
        }

        {
            Supplier<Exception> f = () -> {
                try {
                    join8().asTable("abcv").avgOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1d);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `abcv` t2 ON t.`id` = t2.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join8().asTable("abcv").avgBigDecimalOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },BigDecimal.ZERO);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `abcv` t2 ON t.`id` = t2.`id`",sql);
        }
        {
            Supplier<Exception> f = () -> {
                try {
                    join8().asTable("abcv").avgFloatOrDefaultMerge(o->{
                        o.t().column(Topic::getStars);
                    },1f);
                }catch (Exception ex){
                    return ex;
                }
                return null;
            };
            Exception exception = f.get();
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof EasyQuerySQLCommandException);
            EasyQuerySQLCommandException easyQuerySQLCommandException = (EasyQuerySQLCommandException) exception;
            Assert.assertTrue(easyQuerySQLCommandException.getCause() instanceof EasyQuerySQLStatementException);
            EasyQuerySQLStatementException easyQuerySQLStatementException = (EasyQuerySQLStatementException) easyQuerySQLCommandException.getCause();
            String sql = easyQuerySQLStatementException.getSQL();
            Assert.assertEquals("SELECT AVG(t.`stars`) FROM `t_topic` t RIGHT JOIN `t_topic` t1 ON t.`id` = t1.`id` RIGHT JOIN `abcv` t2 ON t.`id` = t2.`id`",sql);
        }

    }
}
