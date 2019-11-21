package com.rjf.coreclass;

import java.math.BigInteger;

public class Big {
    public static void main(String[] args){
        BigInteger bigInteger=new BigInteger("123456");

        System.out.println(bigInteger.add(bigInteger));
        System.out.println(bigInteger.subtract(bigInteger));
        System.out.println(bigInteger.multiply(bigInteger));
        System.out.println(bigInteger.divide(bigInteger));
    }
}
