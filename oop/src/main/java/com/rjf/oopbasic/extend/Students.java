package com.rjf.oopbasic.extend;

public class Students extends Person {
    //不要重复name和age字段/方法
    //只需要定义新增score字段/方法
    protected int score;




    public Students(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
