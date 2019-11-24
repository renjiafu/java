package com.rjf.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[]args){
        int[] a={10,9,7,8,3,5,4,2,1,0};
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j]>a[j+1]){
                    int temp=0;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            System.out.println(Arrays.toString(a));
        }
        System.out.println("############################");
        int[] b={10,9,7,8,3,5,4,2,1,0};
        for(int i=0;i<10;i++)
        {
            for (int j=0;j<10;j++)
            {
                if(b[i]<b[j])
                {
                    int temp = b[i];
                    b[i]=b[j];
                    b[j] = temp;
                }
            }
            System.out.println(Arrays.toString(b));
        }

    }
}
