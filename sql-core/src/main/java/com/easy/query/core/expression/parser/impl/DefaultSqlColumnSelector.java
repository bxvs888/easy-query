package com.easy.query.core.expression.parser.impl;

import com.easy.query.core.expression.parser.core.available.TableAvailable;
import com.easy.query.core.expression.parser.core.SqlColumnSelector;
import com.easy.query.core.expression.segment.builder.SqlBuilderSegment;
import com.easy.query.core.expression.sql.builder.EntityExpressionBuilder;

/**
 * @FileName: DefaultSqlColumnSelector.java
 * @Description: 文件说明
 * @Date: 2023/2/12 21:36
 * @author xuejiaming
 */
public class DefaultSqlColumnSelector<T1> extends AbstractSqlColumnSelector<T1, SqlColumnSelector<T1>> implements SqlColumnSelector<T1> {
    public DefaultSqlColumnSelector(int index, EntityExpressionBuilder sqlEntityExpression, SqlBuilderSegment sqlSegmentBuilder) {
        super(index, sqlEntityExpression,sqlSegmentBuilder);
    }

    @Override
    public TableAvailable getTable() {
        return table;
    }
}
