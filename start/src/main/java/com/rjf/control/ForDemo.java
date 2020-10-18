package com.rjf.control;

/*
 *
 *   Rene
 *   2020/5/7 20:20
 */

public class ForDemo {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int[] arr = {1, 2, 3};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
