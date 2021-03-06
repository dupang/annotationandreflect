package com.dupang.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * ClassName:com.dupang.annotation.FruitProvider
 * </p>
 * <p>
 * 描述:水果供应者注解
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
public @interface FruitProvider {
    /**
     * 供应商编号
     */
    public int id() default -1;

    /**
     * 供应商名称
     */
    public String name() default "";

    /**
     * 供应商地址
     */
    public String address() default "";
}
