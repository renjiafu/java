package com.rjf.start.array;

import java.util.Arrays;

public class NArrayDemo {

    public static void main(String[] args){
        // 1.定义二维数组
        int[][] ns = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(ns.length);

        for (int[] arr : ns) {
            for (int n : arr) {
                System.out.print(n);
                System.out.print(" , ");
            }
            System.out.println();
        }

        // 2.深度遍历多维数组
        System.out.println(Arrays.deepToString(ns));

    }

}
