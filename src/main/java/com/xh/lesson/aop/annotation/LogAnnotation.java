package com.xh.lesson.aop.annotation;

import java.lang.annotation.*;

/**
* @ClassName:       LogAnnotation
*                   自定义注解
*/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {
    /** 模块 */
    String title() default "";

    /** 功能 */
    String action() default "";
}
