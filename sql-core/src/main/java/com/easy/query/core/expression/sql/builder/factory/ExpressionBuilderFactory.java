package com.easy.query.core.expression.sql.builder.factory;

import com.easy.query.core.context.QueryRuntimeContext;
import com.easy.query.core.enums.MultiTableTypeEnum;
import com.easy.query.core.enums.SQLUnionEnum;
import com.easy.query.core.expression.EntityTableAvailable;
import com.easy.query.core.expression.parser.core.available.TableAvailable;
import com.easy.query.core.expression.sql.builder.EntityDeleteExpressionBuilder;
import com.easy.query.core.expression.sql.builder.EntityInsertExpressionBuilder;
import com.easy.query.core.expression.sql.builder.EntityQueryExpressionBuilder;
import com.easy.query.core.expression.sql.builder.EntityTableExpressionBuilder;
import com.easy.query.core.expression.sql.builder.EntityUpdateExpressionBuilder;
import com.easy.query.core.expression.sql.builder.ExpressionContext;
import com.easy.query.core.expression.sql.builder.impl.AnonymousQueryExpressionBuilder;
import com.easy.query.core.expression.sql.builder.impl.AnonymousUnionQueryExpressionBuilder;
import com.easy.query.core.metadata.EntityMetadata;

import java.util.List;
import java.util.function.Function;

/**
 * @Description: 文件说明
 * @Date: 2023/3/4 22:43
 * @author xuejiaming
 */
public interface ExpressionBuilderFactory {
    ExpressionContext createExpressionContext(QueryRuntimeContext runtimeContext);
   default EntityTableExpressionBuilder createEntityTableExpressionBuilder(EntityMetadata entityMetadata, MultiTableTypeEnum multiTableType, QueryRuntimeContext runtimeContext){
       return createEntityTableExpressionBuilder(new EntityTableAvailable(entityMetadata,false),multiTableType,runtimeContext);
   }
    EntityTableExpressionBuilder createEntityTableExpressionBuilder(TableAvailable tableAvailable, MultiTableTypeEnum multiTableType, QueryRuntimeContext runtimeContext);
   default EntityTableExpressionBuilder createAnonymousEntityTableExpressionBuilder(EntityMetadata entityMetadata,MultiTableTypeEnum multiTableType, EntityQueryExpressionBuilder entityQueryExpressionBuilder){
       return createAnonymousEntityTableExpressionBuilder(new EntityTableAvailable(entityMetadata,true),multiTableType,entityQueryExpressionBuilder);
   }
    EntityTableExpressionBuilder createAnonymousEntityTableExpressionBuilder(TableAvailable tableAvailable, MultiTableTypeEnum multiTableType, EntityQueryExpressionBuilder entityQueryExpressionBuilder);
    EntityQueryExpressionBuilder createEntityQueryExpressionBuilder(ExpressionContext sqlExpressionContext,Class<?> queryClass);
    default EntityQueryExpressionBuilder createAnonymousQueryExpressionBuilder(String sql, ExpressionContext sqlExpressionContext,Class<?> queryClass){
        return new AnonymousQueryExpressionBuilder(sql,sqlExpressionContext,queryClass);
    }
    default EntityQueryExpressionBuilder createAnonymousUnionQueryExpressionBuilder(List<EntityQueryExpressionBuilder> entityQueryExpressionBuilders, ExpressionContext sqlExpressionContext,Class<?> queryClass, SQLUnionEnum sqlUnion){
        return new AnonymousUnionQueryExpressionBuilder(entityQueryExpressionBuilders,sqlExpressionContext,queryClass,sqlUnion);
    }
    EntityInsertExpressionBuilder createEntityInsertExpressionBuilder(ExpressionContext sqlExpressionContext,Class<?> queryClass);
    EntityUpdateExpressionBuilder createEntityUpdateExpressionBuilder(ExpressionContext sqlExpressionContext,Class<?> queryClass, boolean expression);
    EntityDeleteExpressionBuilder createEntityDeleteExpressionBuilder(ExpressionContext sqlExpressionContext,Class<?> queryClass, boolean expression);
}
