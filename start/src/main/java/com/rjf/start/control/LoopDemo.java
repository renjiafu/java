package com.rjf.start.control;

public class LoopDemo {
    public static void main(String[] args){

        int i=100;
        int sum=0;

        while(i > 0){
            sum+=i;
            i--;
        }
        System.out.println(sum);

        for (int j = 0; j < 100; j++) {
            sum-=j;
        }
        System.out.println(sum);

    }
}
