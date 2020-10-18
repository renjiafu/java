package com.rjf.common;

/*
 *
 *   Rene
 *   2020/5/7 20:25
 */

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;

public class NumbersDemo {

    public static void main(String[] args) {

        int i1 =127;
        Integer integer1 = 127;
        Integer integer2 = 127;
        Integer integer3 = 128;
        Integer integer4 = 128;

        System.out.println(i1 == integer1);// 自动拆装箱 true
        System.out.println(integer1 == integer2);// 常量池 true
        System.out.println(integer3 == integer4);// 不在常量池 false

        int i2 = Integer.parseInt("10"); // 返回基本数据类型
        Integer integer5 = Integer.valueOf("10"); // 返回包装类型

        double d1 = Double.parseDouble("1.99");
        Double double1 = Double.valueOf("1.99");

        System.out.println("BigInteger --->");
        BigInteger bigInteger1= new BigInteger("0111",2);
        System.out.println(bigInteger1);
        System.out.println(bigInteger1.toString(3));

        System.out.println("BigDecimal --->");
        BigDecimal bigDecimal1= new BigDecimal("1.999999");
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String formatDecimal = decimalFormat.format(bigDecimal1);
        System.out.println(bigDecimal1);
        System.out.println("formatDecimal ---> "+formatDecimal);

    }
}
