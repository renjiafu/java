package com.rjf.advance.serializer;

/*
 *
 *   Rene
 *   2020/6/27 11:21
 */

import java.io.Serializable;

public class Person implements Serializable {

    String name;
    Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
