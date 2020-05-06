package com.rjf.basic;

/*
 *   基本数据类型
 *   Rene
 *   2020/5/6 22:54
 */

public class BasicDataTypesDemo {

    public static void main(String[] args) {

        byte byte1 = -128;
        byte byte2 = 127;

        short short1 = -32768;
        short short2 = 32767;

        int int1 = 2147483647;
        int int2 = -2147483648;
        int int3 = 2_000_000_000; // 加下划线更容易识别
        int int4 = 0xff0000; // 十六进制表示的16711680
        int int5 = 0b1000000000; // 二进制表示的512
        long l1 = 9000000000000000000L; // long型的结尾需要加L

        float f1 = 3.14f;
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324

        boolean b1 = true;
        boolean b2 = false;
        boolean isGreater = 5 > 3; // 计算结果为true
        int age = 12;
        boolean isAdult = age >= 18; // 计算结果为false

        char a = 'A';
        char zh = '中';


        /*
                基本数据类型是CPU可以直接进行运算的类型。Java定义了以下几种基本数据类型：

                整数类型：byte，short，int，long

                浮点数类型：float，double

                字符类型：char

                布尔类型：boolean
         */
    }

}
