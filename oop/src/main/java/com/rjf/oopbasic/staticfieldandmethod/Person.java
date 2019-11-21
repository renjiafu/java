package com.rjf.oopbasic.staticfieldandmethod;

public class Person {
    public String name;
    public int age;

    //定义静态字段
    public static int number;

    public static void setNumber(int value){
        number=value;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
