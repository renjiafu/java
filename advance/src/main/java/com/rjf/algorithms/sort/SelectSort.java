package com.rjf.algorithms.sort;

/*
 *
 *   Rene
 *   2020/5/24 20:55
 */

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {

        int[] arr = {9,8,7,6,5,4,3,2,1,0};

        selectSort(arr);

        System.out.println("排序完毕 : \n"+Arrays.toString(arr));
    }

    private static void selectSort(int[] arr){

        int count=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

                count++;
                System.out.println(Arrays.toString(arr)+" O = "+count);
            }
        }
    }
}
