package com.easy.query.core.expression.executor.parser;

import com.easy.query.core.basic.jdbc.executor.ExecutorContext;
import com.easy.query.core.expression.sql.builder.EntityExpressionBuilder;

import java.util.List;

/**
 * create time 2023/4/9 22:17
 * 文件说明
 *
 * @author xuejiaming
 */
public interface EasyPrepareParser {
   default PrepareParseResult parse(ExecutorContext executorContext, EntityExpressionBuilder entityExpressionBuilder){
       return parse(executorContext,entityExpressionBuilder,null,false);
   }
    PrepareParseResult parse(ExecutorContext executorContext,EntityExpressionBuilder entityExpressionBuilder, List<Object> entities, boolean fillAutoIncrement);
}
