package com.rjf.arr;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args){
        int[] ar={1,4,9,12,16,25};
        for (int i = 0; i < ar.length; i++) {
            int n= ar[i];
            System.out.println(n);
        }
        for (int x:ar ) {
            System.out.println(x);
        }
        System.out.println(Arrays.toString(ar));

        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
