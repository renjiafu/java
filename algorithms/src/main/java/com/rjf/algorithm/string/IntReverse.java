package com.rjf.algorithm.string;

/*
 *   整数反转
 *   Rene
 *   2020/7/14 20:25
 */

public class IntReverse {

    public static void main(String[] args) {

        System.out.println(call(123));
        System.out.println(call(-123));
    }
    
    static int call(int x){
        try{
            if (x>0){
                String s = String.valueOf(x);
                StringBuilder stringBuilder = new StringBuilder(s);
                int i = Integer.parseInt(stringBuilder.reverse().toString());
                return i;
            }else{
                int abs = Math.abs(x);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(abs));
                int i = Integer.parseInt(stringBuilder.reverse().toString());
                return 0-i;
            }
        }catch (Exception e){
            return 0;
        }

    }
}
