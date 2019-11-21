package com.rjf.oopbasic.method;

public class Methos {

    private String name;
    private int age;

    public Methos(String name) {
        this.name = name;
    }

    public Methos(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    //防御空值
    public void setName(String name) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
