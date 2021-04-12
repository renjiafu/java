package com.rjf.start.basic;

/*
 *   变量类型
 *   Rene
 *   2019/6/6 22:54
 */

public class BasicVariablesDemo {


    // 静态的私有变量(类变量)
    private static double salary;

    // 常量
    public static final String DEV = "开发";

    // 私有变量
    private String name;


    public BasicVariablesDemo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // 局部变量
        int age = 18;

        salary = 10000;
        BasicVariablesDemo demo = new BasicVariablesDemo("小明");

        System.out.println(demo.getName()+" 职业: "+DEV+" 月薪："+salary);

    }
}
