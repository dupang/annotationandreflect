package com.dupang.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * ClassName:com.dupang.annotation.FruitName
 * </p>
 * <p>
 * 描述:水果名称注释
 * </p>
 * <p>
 * 日期:2017年03月15
 * </p>
 *
 * @author duguanxin
 * @version 1.0
 * @since 1.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
