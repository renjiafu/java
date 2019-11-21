package com.rjf.reflect;

import java.lang.reflect.Method;

public class CallMethods {
    public static void main(String[] args) throws Exception {
        // 获取Person的hello方法:
        Method method = Person.class.getMethod("hello");
        // 对Student实例调用hello方法:
        method.invoke(new Student());
    }
}


