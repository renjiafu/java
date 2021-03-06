package com.rjf.algorithm.easy;

import java.util.Arrays;

/**
 * @program: java
 * @description: 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。  最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。  你可以假设除了整数 0 之外，这个整数不会以零开头。
 * @author: Rene
 * @create: 2020-11-12 22:43
 **/

public class plusOneDemo {

    public static void main(String[] args) {

        int[] ints= {1,2,3};

        // [1,2,4]
        System.out.println(Arrays.toString(plusOne(ints)));
    }

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length -1;i>=0;i--){
            if(digits[i] != 9 ){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int[] temp = new int[digits.length + 1];
        temp[0]=1;
        return temp;
    }
}
