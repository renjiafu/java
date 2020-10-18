package com.rjf.algorithms.recursive;

/*
 *
 *   Rene
 *   2020/7/7 22:26
 */

public class RecursiveDemo {

    public static void main(String[] args) {

        // 求 1...100和
        System.out.println(sum(100));

        // 求10级台阶 每次跳1或2 共计可能跳法
        System.out.println(skip(10));
    }

    static int sum(int i){
        if (i==1){
            return 1;
        }else {
            return i+sum(i-1);
        }
    }

    static int skip(int i){
        if (i==0 || i==1 || i==2 ){
            return i;
        }else {
            return skip(i-1)+skip(i-2);
        }
    }

}
