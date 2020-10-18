package com.rjf.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Check {
    int min() default 0;
    int max() default 100;
    int value() default 60;

    /*
        Java使用@interface定义注解：

        可定义多个参数和默认值，核心参数使用value名称；

        必须设置@Target来指定Annotation可以应用的范围；

        应当设置@Retention(RetentionPolicy.RUNTIME)便于运行期读取该Annotation。
    */
}


