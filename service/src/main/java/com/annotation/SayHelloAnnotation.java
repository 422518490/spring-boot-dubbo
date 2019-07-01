package com.annotation;

import org.apache.dubbo.config.annotation.Method;

import java.lang.annotation.*;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/6/25
 * @description
 */
@Method(name = "sayHello",timeout = 100,retries = 6)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Inherited
public @interface SayHelloAnnotation {
}
