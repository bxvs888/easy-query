package com.easy.query.test.mssqlrownumber;

import com.easy.query.api4j.select.Queryable;
import com.easy.query.core.api.pagination.EasyPageResult;
import com.easy.query.test.mssql.entity.MsSQLMyTopic;
import com.easy.query.test.mssql.entity.MsSQLMyTopic1;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * create time 2023/7/27 17:34
 * 文件说明
 *
 * @author xuejiaming
 */
public class MsSQLRowNumberQueryTest extends MsSQLRowNumberBaseTest {

    @Test
    public void query0() {
        Queryable<MsSQLMyTopic> queryable = easyQuery.queryable(MsSQLMyTopic.class)
                .where(o -> o.eq(MsSQLMyTopic::getId, "123xxx"));
        String sql = queryable.toSQL();
        Assert.assertEquals("SELECT [Id],[Stars],[Title],[CreateTime] FROM [MyTopic] WHERE [Id] = ?", sql);
        MsSQLMyTopic msSQLMyTopic = queryable.firstOrNull();
        Assert.assertNull(msSQLMyTopic);
    }
    @Test
    public void query1() {
        Queryable<MsSQLMyTopic> queryable = easyQuery.queryable(MsSQLMyTopic.class)
                .where(o -> o.eq(MsSQLMyTopic::getId, "1"));
        String sql = queryable.toSQL();
        Assert.assertEquals("SELECT [Id],[Stars],[Title],[CreateTime] FROM [MyTopic] WHERE [Id] = ?", sql);
        MsSQLMyTopic msSQLMyTopic = queryable.firstOrNull();
        Assert.assertNotNull(msSQLMyTopic);
        Assert.assertNotNull(msSQLMyTopic.getId());
        Assert.assertNotNull(msSQLMyTopic.getStars());
        Assert.assertNotNull(msSQLMyTopic.getTitle());
        Assert.assertNotNull(msSQLMyTopic.getCreateTime());
    }
    @Test
    public void query2() {
        Queryable<MsSQLMyTopic1> queryable = easyQuery.queryable(MsSQLMyTopic1.class)
                .where(o -> o.eq(MsSQLMyTopic1::getId, "123xxx"));
        String sql = queryable.toSQL();
        Assert.assertEquals("SELECT [Id],[Stars],[Title],[CreateTime] FROM [MyTopic] WHERE [Id] = ?", sql);
        MsSQLMyTopic1 msSQLMyTopic = queryable.firstOrNull();
        Assert.assertNull(msSQLMyTopic);
    }
    @Test
    public void query3() {
        Queryable<MsSQLMyTopic1> queryable = easyQuery.queryable(MsSQLMyTopic1.class)
                .where(o -> o.eq(MsSQLMyTopic1::getId, "1"));
        String sql = queryable.toSQL();
        Assert.assertEquals("SELECT [Id],[Stars],[Title],[CreateTime] FROM [MyTopic] WHERE [Id] = ?", sql);
        MsSQLMyTopic1 msSQLMyTopic = queryable.firstOrNull();
        Assert.assertNotNull(msSQLMyTopic);
        Assert.assertNotNull(msSQLMyTopic.getId());
        Assert.assertNotNull(msSQLMyTopic.getStars());
        Assert.assertNotNull(msSQLMyTopic.getTitle());
        Assert.assertNotNull(msSQLMyTopic.getCreateTime());
    }
    @Test
    public void query4_1() {

        List<MsSQLMyTopic> list = easyQuery
                .queryable(MsSQLMyTopic.class)
                .where(o -> o.isNotNull(MsSQLMyTopic::getId))
                .limit(20).toList();
        Assert.assertEquals(20, list.size());
    }
    @Test
    public void query4_2() {

        List<MsSQLMyTopic> list = easyQuery
                .queryable(MsSQLMyTopic.class)
                .where(o -> o.isNotNull(MsSQLMyTopic::getId))
                .orderByAsc(o->o.column(MsSQLMyTopic::getId))
                .limit(20).toList();
        Assert.assertEquals(20, list.size());
    }
    @Test
    public void query4() {

        EasyPageResult<MsSQLMyTopic> topicPageResult = easyQuery
                .queryable(MsSQLMyTopic.class)
                .where(o -> o.isNotNull(MsSQLMyTopic::getId))
                .toPageResult(2, 20);
        List<MsSQLMyTopic> data = topicPageResult.getData();
        Assert.assertEquals(20, data.size());
    }
    @Test
    public void query5_1() {

        EasyPageResult<MsSQLMyTopic> topicPageResult = easyQuery
                .queryable(MsSQLMyTopic.class)
                .where(o -> o.isNotNull(MsSQLMyTopic::getId))
                .orderByAsc(o->o.column(MsSQLMyTopic::getId))
                .toPageResult(1, 20);
        List<MsSQLMyTopic> data = topicPageResult.getData();
        Assert.assertEquals(20, data.size());
    }
    @Test
    public void query5() {

        EasyPageResult<MsSQLMyTopic> topicPageResult = easyQuery
                .queryable(MsSQLMyTopic.class)
                .where(o -> o.isNotNull(MsSQLMyTopic::getId))
                .orderByAsc(o->o.column(MsSQLMyTopic::getId))
                .toPageResult(2, 20);
        List<MsSQLMyTopic> data = topicPageResult.getData();
        Assert.assertEquals(20, data.size());
    }

    @Test
    public void query5_2() {

        String sql = easyQuery
                .queryable(MsSQLMyTopic.class)
                .where(o -> o.isNotNull(MsSQLMyTopic::getId))
                .orderByAsc(o -> o.column(MsSQLMyTopic::getId))
                .limit(40, 20).toSQL();
        Assert.assertEquals("WITH rt AS ( SELECT [Id],[Stars],[Title],[CreateTime], ROW_NUMBER() OVER( ORDER BY [Id] ASC ) AS __rownum__ FROM [MyTopic] WHERE [Id] IS NOT NULL ) SELECT rt.* FROM rt where rt.__rownum__ BETWEEN 41 AND 60",sql);
    }
    @Test
    public void query5_3() {

        String sql = easyQuery
                .queryable(MsSQLMyTopic.class)
                .where(o -> o.isNotNull(MsSQLMyTopic::getId))
                .limit(40, 20).toSQL();
        Assert.assertEquals("WITH rt AS ( SELECT [Id],[Stars],[Title],[CreateTime], ROW_NUMBER() OVER( ORDER BY [Id] ) AS __rownum__ FROM [MyTopic] WHERE [Id] IS NOT NULL ) SELECT rt.* FROM rt where rt.__rownum__ BETWEEN 41 AND 60",sql);
    }
    @Test
    public void query6() {

        EasyPageResult<MsSQLMyTopic> topicPageResult = easyQuery
                .queryable(MsSQLMyTopic.class)
                .where(o -> o.isNotNull(MsSQLMyTopic::getId))
                .orderByAsc(o->o.column(MsSQLMyTopic::getStars))
                .toPageResult(2, 20);
        List<MsSQLMyTopic> data = topicPageResult.getData();
        Assert.assertEquals(20, data.size());
        for (int i = 0; i < 20; i++) {
            MsSQLMyTopic msSQLMyTopic = data.get(i);
            Assert.assertEquals(msSQLMyTopic.getId(),String.valueOf(i+20) );
            Assert.assertEquals(msSQLMyTopic.getStars(),(Integer)(i+120) );
        }
    }
}
