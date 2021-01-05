package com.rjf.oop.ext;

public class Student extends Person {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
        this.name = name;
    }

    public void printName(){
        System.out.println(getName());
        System.out.println(super.getName());
    }
}
