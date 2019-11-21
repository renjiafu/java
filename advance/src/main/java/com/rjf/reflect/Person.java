package com.rjf.reflect;


class Person {
    public String name;

    public void hello(){
        System.out.println("Hello!Reflect");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}