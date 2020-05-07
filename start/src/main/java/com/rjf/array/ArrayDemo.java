package com.rjf.array;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] arr = {1, 4, 9, 12, 16, 25};
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            System.out.println(n);
        }
        for (int x : arr) {
            System.out.println(x);
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,4)); //1
    }
}
