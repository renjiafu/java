package com.rjf.process;

public class Loop {
    public static void main(String[] args){

        int i=100;
        int sum=0;
        while(i-- > 0){

            sum+=i;

        }
        System.out.println(sum);

        for (int j = 0; j < 100; j++) {
            sum-=j;
        }

        System.out.println(sum);

    }
}
