package com.dupang.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * ClassName:com.dupang.annotation.FruitColor
 * </p>
 * <p>
 * 描述:水果颜色注解
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
public @interface FruitColor {

    /**
     * 颜色枚举
     */
    public enum Color {
        BULE, RED, GREEN
    };

    /**
     * 颜色属性
     */
    Color fruitColor() default Color.GREEN;
}
