package com.rjf.reflect;


class Student extends Person {

    public int score;
    private int grade;

    public void hello(){
        System.out.println("Hello!Reflect");
    }

    public Student() {
        super();
    }
    public Student(String name, int score, int grade) {
        super(name);
        this.score = score;
        this.grade = grade;
    }



}