package com.rjf.algorithms;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] a = {10, 9, 7, 8, 3, 5, 4, 2, 1, 0};
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && temp <= a[j]) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = temp;
            System.out.println(Arrays.toString(a));
        }

    }
}
