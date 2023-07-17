package com.easy.query.core.annotation;

import com.easy.query.core.enums.RelationTypeEnum;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * create time 2023/6/17 19:21
 * 导航属性 关联查询
 *
 * @author xuejiaming
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
public @interface Navigate {
    /**
     * 当前对象的哪个属性关联目标对象,空表示使用当前对象的主键
     * @return
     */
    String selfProperty() default "";
    /**
     * 关联关系
     */
    RelationTypeEnum value();
    /**
     * 当前对象的{@param selfProperty}属性关联目标的哪个属性,空表示使用目标对象的主键
     */
    String targetProperty() default "";

    /**
     * 多对多填写
     * 多对多中间表 中间表必须是表对象 多对多不能为空
     * @return
     */
    Class<?> mappingClass() default Object.class;

    /**
     * 多对多填写
     * 当前对象的{@param selfProperty}属性对应中间表的哪个属性,多对多不能为空
     * @return
     */
    String selfMappingProperty() default "";

    /**
     * 多对多填写
     * 目标对象的{@param targetProperty}属性对应中间表的哪个属性,多对多不能为空
     * @return
     */
    String targetMappingProperty() default "";
}
