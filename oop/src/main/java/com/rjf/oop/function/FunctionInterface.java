package com.rjf.oop.function;

/**
 *  函数式接口
 *  des:
 *  特点：有且仅有一个抽象方法（延迟至lambda表达式or方法引用实现）
 *  1.给此接口仅有的一个抽象方法定义出入参，方法名
 */

@FunctionalInterface
public interface FunctionInterface {

    void doSomething(String str);
}
