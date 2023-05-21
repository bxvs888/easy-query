package com.easy.query.core.expression.parser.core;

import com.easy.query.core.basic.api.select.Queryable;
import com.easy.query.core.context.QueryRuntimeContext;
import com.easy.query.core.expression.func.ColumnFunction;
import com.easy.query.core.expression.func.ColumnPropertyFunction;
import com.easy.query.core.expression.func.DefaultColumnPropertyFunction;
import com.easy.query.core.expression.lambda.Property;
import com.easy.query.core.expression.parser.core.available.TableAvailable;

import java.util.function.Function;

/**
 *
 * @Description: 文件说明
 * @Date: 2023/2/6 22:58
 * @author xuejiaming
 */
public interface SQLColumnAsSelector<T1,TR>  {
    QueryRuntimeContext getRuntimeContext();
    TableAvailable getTable();
    SQLColumnAsSelector<T1,TR> column(Property<T1,?> column);
    SQLColumnAsSelector<T1,TR> columnIgnore(Property<T1,?> column);
    SQLColumnAsSelector<T1,TR> columnAll();
    SQLColumnAsSelector<T1,TR> columnAs(Property<T1,?> column, Property<TR, ?> alias);
   <T2> SQLColumnAsSelector<T1,TR> columnSubQueryAs(Function<SQLWherePredicate<T1>,Queryable<T2>> subQueryableFunc, Property<TR, T2> alias);
   default SQLColumnAsSelector<T1,TR> columnCount(Property<T1,?> column){
       return columnCount(column,null);
   }
   default SQLColumnAsSelector<T1,TR> columnCount(Property<T1,?> column, Property<TR,?> alias){
       ColumnFunction countFunction = getRuntimeContext().getColumnFunctionFactory().createCountFunction(false);
       ColumnPropertyFunction columnPropertyFunction = DefaultColumnPropertyFunction.createDefault(column, countFunction);
       return columnFuncAs(columnPropertyFunction, alias);
   }
   default SQLColumnAsSelector<T1,TR> columnCountDistinct(Property<T1,?> column){
       return columnCountDistinct(column,null);
   }
   default SQLColumnAsSelector<T1,TR> columnCountDistinct(Property<T1,?> column, Property<TR,?> alias){
       ColumnFunction countFunction = getRuntimeContext().getColumnFunctionFactory().createCountFunction(true);
       ColumnPropertyFunction columnPropertyFunction = DefaultColumnPropertyFunction.createDefault(column, countFunction);
       return columnFuncAs(columnPropertyFunction, alias);
   }
   default SQLColumnAsSelector<T1,TR> columnSum(Property<T1,Number> column){
       return columnSum(column,null);
   }
   default SQLColumnAsSelector<T1,TR> columnSum(Property<T1,Number> column, Property<TR,Number> alias){
       ColumnFunction countFunction = getRuntimeContext().getColumnFunctionFactory().createSumFunction(false);
       ColumnPropertyFunction columnPropertyFunction = DefaultColumnPropertyFunction.createDefault(column, countFunction);
       return columnFuncAs(columnPropertyFunction, alias);
   }
   default SQLColumnAsSelector<T1,TR> columnSumDistinct(Property<T1,Number> column){
       return columnSumDistinct(column,null);
   }
   default SQLColumnAsSelector<T1,TR> columnSumDistinct(Property<T1,Number> column, Property<TR,Number> alias){
       ColumnFunction countFunction = getRuntimeContext().getColumnFunctionFactory().createSumFunction(true);
       ColumnPropertyFunction columnPropertyFunction = DefaultColumnPropertyFunction.createDefault(column, countFunction);
       return columnFuncAs(columnPropertyFunction, alias);
   }
    default SQLColumnAsSelector<T1,TR> columnMax(Property<T1,?> column){
        return columnMax(column,null);
    }
   default SQLColumnAsSelector<T1,TR> columnMax(Property<T1,?> column, Property<TR,?> alias){
       ColumnFunction countFunction = getRuntimeContext().getColumnFunctionFactory().createMaxFunction();
       ColumnPropertyFunction columnPropertyFunction = DefaultColumnPropertyFunction.createDefault(column, countFunction);
       return columnFuncAs(columnPropertyFunction, alias);
   }
    default SQLColumnAsSelector<T1,TR> columnMin(Property<T1,?> column){
        return columnMin(column,null);
    }
   default SQLColumnAsSelector<T1,TR> columnMin(Property<T1,?> column, Property<TR,?> alias){
       ColumnFunction countFunction = getRuntimeContext().getColumnFunctionFactory().createMinFunction();
       ColumnPropertyFunction columnPropertyFunction = DefaultColumnPropertyFunction.createDefault(column, countFunction);
       return columnFuncAs(columnPropertyFunction, alias);
   }
   default SQLColumnAsSelector<T1,TR> columnAvg(Property<T1,Number> column){
       return columnAvg(column,null);
   }
   default SQLColumnAsSelector<T1,TR> columnAvg(Property<T1,Number> column, Property<TR,Number> alias){
       ColumnFunction countFunction = getRuntimeContext().getColumnFunctionFactory().createAvgFunction(false);
       ColumnPropertyFunction columnPropertyFunction = DefaultColumnPropertyFunction.createDefault(column, countFunction);
       return columnFuncAs(columnPropertyFunction, alias);
   }
   default SQLColumnAsSelector<T1,TR> columnAvgDistinct(Property<T1,Number> column){
       return columnAvgDistinct(column,null);
   }
   default SQLColumnAsSelector<T1,TR> columnAvgDistinct(Property<T1,Number> column, Property<TR,Number> alias){
       ColumnFunction countFunction = getRuntimeContext().getColumnFunctionFactory().createAvgFunction(true);
       ColumnPropertyFunction columnPropertyFunction = DefaultColumnPropertyFunction.createDefault(column, countFunction);
       return columnFuncAs(columnPropertyFunction, alias);
   }
   default SQLColumnAsSelector<T1,TR> columnLen(Property<T1,?> column){
       return columnLen(column,null);
   }
   default SQLColumnAsSelector<T1,TR> columnLen(Property<T1,?> column, Property<TR,?> alias){
       ColumnFunction countFunction = getRuntimeContext().getColumnFunctionFactory().createLenFunction();
       ColumnPropertyFunction columnPropertyFunction = DefaultColumnPropertyFunction.createDefault(column, countFunction);
       return columnFuncAs(columnPropertyFunction, alias);
   }

    SQLColumnAsSelector<T1,TR> columnFuncAs(ColumnPropertyFunction columnPropertyFunction, Property<TR, ?> alias);//EasyAggregate
   default  <T2> SQLColumnAsSelector<T2,TR> then(SQLColumnAsSelector<T2,TR> sub){
       return sub;
   }
}
