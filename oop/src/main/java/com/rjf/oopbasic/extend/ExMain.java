package com.rjf.oopbasic.extend;


public class ExMain {
    public static void main(String[] args){
        Person person=new Person("xiaoming",12);
        Students students=new Students("xiaohong",20,99);

        Students ps=new PrimaryStudent("xiaohua",9,100,5);
        System.out.println(ps.getScore());
    }
}
