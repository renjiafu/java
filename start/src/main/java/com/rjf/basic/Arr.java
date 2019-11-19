package com.rjf.basic;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args){
        int[] as={1,3,5,7,9};
        int[] as1=new int[5];
        as1=as;
        System.out.println(Arrays.toString(as1));

        String[] names={"xiaoming","xiaohua","xiaohong"};
        System.out.println(names[0]);
    }
}
