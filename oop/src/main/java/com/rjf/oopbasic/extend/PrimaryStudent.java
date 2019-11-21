package com.rjf.oopbasic.extend;

public class PrimaryStudent extends Students{
    protected int grade;



    public PrimaryStudent(String name, int age, int score, int grade) {
        super(name, age, score);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
