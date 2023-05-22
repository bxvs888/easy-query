package com.easy.query.h2.expression;

import com.easy.query.core.context.QueryRuntimeContext;
import com.easy.query.core.enums.MultiTableTypeEnum;
import com.easy.query.core.expression.parser.core.available.TableAvailable;
import com.easy.query.core.expression.sql.expression.impl.TableSQLExpressionImpl;

/**
 * create time 2023/5/17 22:39
 * 文件说明
 *
 * @author xuejiaming
 */
public class H2TableSQLExpression extends TableSQLExpressionImpl {
    public H2TableSQLExpression(TableAvailable entityTable, MultiTableTypeEnum multiTableType, QueryRuntimeContext runtimeContext) {
        super(entityTable, multiTableType, runtimeContext);
    }
}
