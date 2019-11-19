package com.rjf.basic;

public class Bool {
    public static void main(String[] args) {
        boolean isGreater = 5 > 3;//true
        int age = 12;
        boolean isZero = age == 0;//false
        boolean isNonZero = !isZero;//true
        boolean isAdult = age >= 18;
        boolean isTeenager = age > 6 && age < 18;

        System.out.println(isAdult ? "Yes" : "No");
       /*
        关系运算符的优先级从高到低
        !
        >，>=，<，<=
        ==，!=
        &&
        ||
        */

    }
}
