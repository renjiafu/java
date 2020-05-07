package com.rjf.common;

/*
 *
 *   Rene
 *   2020/5/7 20:25
 */

public class NumbersDemo {

    public static void main(String[] args) {

        Integer integer1 = 127;
        int i1 = 127;
        Integer integer2 = 127;
        Integer integer3 = 128;
        Integer integer4 = 128;

        System.out.println(i1 == integer1);// 自动拆装箱 true
        System.out.println(integer1 == integer2);// 常量池 true
        System.out.println(integer3 == integer4);// 不在常量池 false


        int i2 = Integer.parseInt("10"); // 返回基本数据类型
        Integer integer5 = Integer.valueOf("10"); // 返回包装类型

    }
}
