package com.easy.query.core.proxy.predicate.aggregate;

import com.easy.query.core.enums.SQLLikeEnum;
import com.easy.query.core.enums.SQLPredicateCompareEnum;
import com.easy.query.core.func.SQLFunc;
import com.easy.query.core.proxy.impl.SQLAggregatePredicateImpl;
import com.easy.query.core.proxy.predicate.DSLLikePredicate;
import com.easy.query.core.util.EasySQLUtil;

/**
 * create time 2023/12/14 22:50
 * 文件说明
 *
 * @author xuejiaming
 */
public interface DSLLikeAggregatePredicate<TProperty> extends DSLLikePredicate<TProperty>,DSLSQLFunctionAvailable {

    @Override
    default void likeMatchLeft(boolean condition, Object val) {
        if (condition) {
//            getEntitySQLContext().accept(new SQLPredicateImpl(f -> {
//                SQLFunc fx = f.getRuntimeContext().fx();
//                f.funcValueFilter(this.getTable(), func().apply(fx), EasySQLUtil.getLikeParameter(val, SQLLikeEnum.LIKE_PERCENT_RIGHT), SQLPredicateCompareEnum.LIKE);
//            }));


            getEntitySQLContext().accept(new SQLAggregatePredicateImpl(f -> {
                SQLFunc fx = f.getRuntimeContext().fx();
                f.funcValueFilter(this.getTable(), func().apply(fx), EasySQLUtil.getLikeParameter(val, SQLLikeEnum.LIKE_PERCENT_RIGHT), SQLPredicateCompareEnum.LIKE);
            },f->{
                SQLFunc fx = f.getRuntimeContext().fx();
                f.func(this.getTable(), func().apply(fx),  SQLPredicateCompareEnum.LIKE,EasySQLUtil.getLikeParameter(val, SQLLikeEnum.LIKE_PERCENT_RIGHT));
            }));
        }
    }

    @Override
    default void likeMatchRight(boolean condition, Object val) {
        if (condition) {
            getEntitySQLContext().accept(new SQLAggregatePredicateImpl(f -> {
                SQLFunc fx = f.getRuntimeContext().fx();
                f.funcValueFilter(this.getTable(), func().apply(fx), EasySQLUtil.getLikeParameter(val, SQLLikeEnum.LIKE_PERCENT_LEFT), SQLPredicateCompareEnum.LIKE);
            },f->{
                SQLFunc fx = f.getRuntimeContext().fx();
                f.func(this.getTable(), func().apply(fx),  SQLPredicateCompareEnum.LIKE,EasySQLUtil.getLikeParameter(val, SQLLikeEnum.LIKE_PERCENT_LEFT));
            }));
        }
    }

    @Override
    default void like(boolean condition, Object val) {
        if (condition) {
            getEntitySQLContext().accept(new SQLAggregatePredicateImpl(f -> {
                SQLFunc fx = f.getRuntimeContext().fx();
                f.funcValueFilter(this.getTable(), func().apply(fx), EasySQLUtil.getLikeParameter(val, SQLLikeEnum.LIKE_PERCENT_ALL), SQLPredicateCompareEnum.LIKE);
            },f->{
                SQLFunc fx = f.getRuntimeContext().fx();
                f.func(this.getTable(), func().apply(fx),  SQLPredicateCompareEnum.LIKE,EasySQLUtil.getLikeParameter(val, SQLLikeEnum.LIKE_PERCENT_ALL));
            }));
        }
    }

    @Override
    default void notLikeMatchLeft(boolean condition, Object val) {
        if (condition) {
            getEntitySQLContext().accept(new SQLAggregatePredicateImpl(f -> {
                SQLFunc fx = f.getRuntimeContext().fx();
                f.funcValueFilter(this.getTable(), func().apply(fx), EasySQLUtil.getLikeParameter(val, SQLLikeEnum.LIKE_PERCENT_RIGHT), SQLPredicateCompareEnum.NOT_LIKE);
            },f->{
                SQLFunc fx = f.getRuntimeContext().fx();
                f.func(this.getTable(), func().apply(fx),  SQLPredicateCompareEnum.NOT_LIKE,EasySQLUtil.getLikeParameter(val, SQLLikeEnum.LIKE_PERCENT_RIGHT));
            }));
        }
    }

    @Override
    default void notLikeMatchRight(boolean condition, Object val) {
        if (condition) {
            getEntitySQLContext().accept(new SQLAggregatePredicateImpl(f -> {
                SQLFunc fx = f.getRuntimeContext().fx();
                f.funcValueFilter(this.getTable(), func().apply(fx), EasySQLUtil.getLikeParameter(val, SQLLikeEnum.LIKE_PERCENT_LEFT), SQLPredicateCompareEnum.NOT_LIKE);
            },f->{
                SQLFunc fx = f.getRuntimeContext().fx();
                f.func(this.getTable(), func().apply(fx),  SQLPredicateCompareEnum.NOT_LIKE,EasySQLUtil.getLikeParameter(val, SQLLikeEnum.LIKE_PERCENT_LEFT));
            }));
        }
    }

    @Override
    default void notLike(boolean condition, Object val) {
        if (condition) {
            getEntitySQLContext().accept(new SQLAggregatePredicateImpl(f -> {
                SQLFunc fx = f.getRuntimeContext().fx();
                f.funcValueFilter(this.getTable(), func().apply(fx), EasySQLUtil.getLikeParameter(val, SQLLikeEnum.LIKE_PERCENT_ALL), SQLPredicateCompareEnum.NOT_LIKE);
            },f->{
                SQLFunc fx = f.getRuntimeContext().fx();
                f.func(this.getTable(), func().apply(fx),  SQLPredicateCompareEnum.NOT_LIKE,EasySQLUtil.getLikeParameter(val, SQLLikeEnum.LIKE_PERCENT_ALL));
            }));
        }
    }
}
