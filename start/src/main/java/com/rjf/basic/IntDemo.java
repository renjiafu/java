package com.rjf.basic;

public class IntDemo {
    public static void main(String[] args){

        int i=(100+200) * (99-88);
        int n=7*(5+(i-9));
        System.out.println(i+":"+n);

        int x=12345 % 7;
        int y=12345 / 7;

        long l1=2147483640;
        long l2=1000;
        long sum=l1+l2;
        System.out.println(sum);

        n++;
        n--;

        int h=7;
        int h1=n << 1;
        int h2=n << 2;
        int h3=n >>1;
        int h4=n >>2;
        int h5=n >>>1;
        int h6=n >>>2;

        n=0 & 0;
        n=0 & 1;
        n=1 & 0;
        n=1 & 1;

        n=~0;
        n=~1;

        n=0^0;//0
        n=0^1;//1
        n=1^0;//1
        n=1^1;//0


        /*
        算术优先级
            ()
            ! ~ ++ --
            * / %
            + -
            << >> >>>
            &
            |
            += -= *= /=
        */

    }
}
