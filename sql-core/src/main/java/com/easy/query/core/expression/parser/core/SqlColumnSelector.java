package com.easy.query.core.expression.parser.core;

import com.easy.query.core.expression.lambda.Property;
import com.easy.query.core.expression.parser.core.available.TableAvailable;

/**
 *
 * @Description: 文件说明
 * @Date: 2023/2/6 23:20
 * @author xuejiaming
 */
public interface SqlColumnSelector<T1> {
    TableAvailable getTable();
    SqlColumnSelector<T1> column(Property<T1,?> column);
    SqlColumnSelector<T1> columnIgnore(Property<T1,?> column);
    SqlColumnSelector<T1> columnAll();
   default  <T2> SqlColumnSelector<T2> then(SqlColumnSelector<T2> sub){
        return sub;
    }
}
