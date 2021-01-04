package com.rjf.basic;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args){

        int[] as={1,3,5,7,9};
        int[] as1=new int[5];
        int[] as2={2,8,1,6,4,3,9,0,7,5};

        as1=as;
        System.out.println(Arrays.toString(as1));

        Arrays.sort(as2);
        for (int i:as2 ) {
            System.out.println(i);
        }

        String[] names={"xiaoming","xiaohua","xiaohong"};
        System.out.println(names[0]);

    }
}
