package com.rjf.start.array;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] arr = {1, 4, 9, 12, 16, 25};

        // 1.索引遍历
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            System.out.println(n);
        }

        // 2.foreach遍历(原理同for i)
        for (int x : arr) {
            System.out.println(x);
        }

        // 3.转换字符串
        System.out.println(Arrays.toString(arr));

        // 4.排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 5.二分搜索(搜索前需要排序)
        System.out.println(Arrays.binarySearch(arr,4)); // 1

    }
}
