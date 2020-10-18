package com.rjf.reflect;

public final class InstanceofDemo {

    public static void main(String[] args) {

        Integer integer = 123;

        System.out.println(integer instanceof Integer);// true,是Integer类型
        System.out.println(integer instanceof Number);// true,是Number类型的子类

        System.out.println(integer.getClass() == Integer.class); // true,getClass()返回Integer.class
//        System.out.println(integer.getClass() == Number.class); // 编译报错 , false,Integer.class != Number.class
    }
}
