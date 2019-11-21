package com.rjf.oopbasic.staticfieldandmethod;

public class StaticMain {
    public static void main(String[] args){
        Person p1=new Person("xiaohua",12);
        Person p2=new Person("xiaoming",22);

        Person.number=100;

        System.out.println(Person.number);

        Person.setNumber(90);
        System.out.println(Person.number);

    }
    /*
    静态字段属于所有实例“共享”的字段，实际上是属于class的字段；

    调用静态方法不需要实例，无法访问this，但可以访问静态字段和其他静态方法；

    静态方法常用于工具类和辅助方法。
    */
}
