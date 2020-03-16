package com.rjf.annotation;

import java.lang.reflect.Field;

public class AnnotationImpl {
    static  void check(AnnotationDemo annotationDemo) throws IllegalArgumentException, ReflectiveOperationException {
        // 遍历所有Field:
        for (Field field : annotationDemo.getClass().getFields()) {
            // 获取Field定义的@Range:
            Check check = field.getAnnotation(Check.class);
            // 如果@Range存在:
            if (check != null) {
                // 获取Field的值:
                Object value = field.get(annotationDemo);

                // 如果值是String:
                if (value instanceof Integer) {
                    int i=(Integer) value;
                    // 判断值是否满足@Check的min/max:
                    if (i < check.min() || i > check.max()) {
                        throw new IllegalArgumentException("Invalid field too big or too little: " + field.getName());
                    }
                }
            }
        }
    }
}
