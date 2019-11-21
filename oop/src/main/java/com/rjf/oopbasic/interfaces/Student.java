package com.rjf.oopbasic.interfaces;

public class Student implements Person {
    @Override
    public void run() {
        System.out.println("run");
    }

    /*
    Java的接口（interface）定义了纯抽象规范，一个类可以实现多个接口；

    接口也是数据类型，适用于向上转型和向下转型；

    接口的所有方法都是抽象方法，接口不能定义实例字段；

    接口可以定义default方法（JDK>=1.8）。
   */
}
