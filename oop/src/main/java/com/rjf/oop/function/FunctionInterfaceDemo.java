package com.rjf.oop.function;

/**
 * des:演示函数式接口的实现与使用
 *
 * <p>Create Time : 2021/3/1 23:02<p/>
 * @author Rene
 */
public class FunctionInterfaceDemo {

    public static void main(String[] args) {

        // 1.lambda表达式实现抽象方法
        call((str) -> System.out.println(str), "hello functionInterface 01!");

        // 2.方法引用
        call(System.out::println, "hello functionInterface 02!");

    }

    // 调用接口抽象方法
    public static void call(FunctionInterface F, String str) {
        F.doSomething(str);
    }
}
