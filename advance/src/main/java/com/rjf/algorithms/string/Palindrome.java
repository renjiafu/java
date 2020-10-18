package com.rjf.algorithms.string;

/*
 *   回文数
 *   Rene
 *   2020/7/14 20:34
 */

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(call(121));
        System.out.println(call(-121));
    }

    static boolean call(int x){
        String s = String.valueOf(x);
        String s1 = new StringBuilder(s).reverse().toString();
        if (s1.equals(s)){
            return true;
        }else {
            return false;
        }
    }

}
