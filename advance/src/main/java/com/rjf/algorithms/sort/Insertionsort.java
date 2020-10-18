package com.rjf.algorithms.sort;

import java.util.Arrays;

public class Insertionsort {

    public static void main(String[] args) {

        int[] ints = {10, 9, 7, 8, 3, 5, 4, 2, 1, 0};

        InsertSort(ints);

        System.out.println("排序完毕 !\n"+Arrays.toString(ints));
    }

    private static void InsertSort(int[] arr){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp <= arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;

                count++;
                System.out.println(Arrays.toString(arr)+" O = "+count);
            }
            arr[j + 1] = temp;

        }
    }
}
