package com.zdy.common.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiOperator {

    String method() default "";

    String module() default "";

    String moduledesc() default "";

}

