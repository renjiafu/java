package com.rjf.coreclass;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Utils {
    public static void main(String[] args){
        Random random=new Random();

        System.out.println(random.nextInt());// 2071575453,每次都不一样
        System.out.println(random.nextInt(10));// 5,生成一个[0,10)之间的int
        System.out.println(random.nextLong());// 8811649292570369305,每次都不一样
        System.out.println(random.nextFloat());// 0.54335...生成一个[0,1)之间的float
        System.out.println(random.nextDouble());// 0.3716...生成一个[0,1)之间的double


        SecureRandom secureRandom=null;
        try{
            secureRandom=SecureRandom.getInstanceStrong();//获取高强度随机数生成器

        }catch(Exception e){
            secureRandom=new SecureRandom();//获取普通随机数生成器
        }
        byte[] bytes=new byte[16];
        secureRandom.nextBytes(bytes);
        System.out.println(Arrays.toString(bytes));

    }
}
