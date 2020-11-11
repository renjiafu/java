package com.rjf.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {10, 9, 7, 8, 3, 5, 4, 2, 1, 0};

        BubbleSort(arr);

        System.out.println("排序完毕! \n" + Arrays.toString(arr));
    }

    private static void BubbleSort(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

                count++;
                System.out.println(Arrays.toString(arr) + " O = " + count);
            }
        }
    }
}