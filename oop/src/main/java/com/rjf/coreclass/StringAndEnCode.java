/*
package com.rjf.coreclass;

import java.nio.charset.StandardCharsets;

public class StringAndEnCode {
    public static void main(String[] args) throws Exception{
        String s1="Hello!";
        String s2=new String(new char[]{'H','e','l','l','o','!'});

        System.out.println(s1+"\n"+s2);

        System.out.println(s1.equals(s2));

        System.out.println(s1.indexOf("l"));
        System.out.println(s1.lastIndexOf("l"));
        System.out.println(s1.indexOf("l"));
        System.out.println(s1.startsWith("l"));
        System.out.println(s1.endsWith("l"));


        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,4));

        System.out.println(" \t Hello\r \n ".trim());
        System.out.println(" \t Hello\r \n ".strip());//可去除中文空格\u3000

        System.out.println("".isEmpty());//true
        System.out.println(" ".isEmpty());//false
        System.out.println(" \n".isBlank());//true
        System.out.println("Hello ".isBlank());//false

        System.out.println(s1.replace('l','w'));
        System.out.println(s1.replace("ll","~~"));
        System.out.println(s1.replaceAll("[\\,\\;\\s]+",","));

        String s3="A,B,C,D";
        String[] ss=s1.split("\\,");

        String[] arr={"A","B","C"};
        String s4=String.join("***",arr);

        //转化成字符串
        String.valueOf(123);
        String.valueOf(45.67);
        String.valueOf(true);
        String.valueOf(new Object());
        //把字符串转化其他类型
        int n1=Integer.parseInt("123");
        int n2=Integer.parseInt("ff",16);//十六进制

        boolean b1=Boolean.parseBoolean("true");
        boolean b2=Boolean.parseBoolean("false");

        */
/*
        要特别注意，Integer有个getInteger(String)方法，
        它不是将字符串转换为int，而是把该字符串对应的系统变量转换为Integer：
        *//*

        Integer.getInteger("java.version");

        char[] cs="Hello".toCharArray();
        String s=new String(cs);

        */
/*
       UTF-8编码，它是一种变长编码.
       用来把固定长度的Unicode编码变成1～4字节的变长编码.
       通过UTF-8编码，英文字符'A'的UTF-8编码变为0x41，正好和ASCII码一致.
       而中文'中'的UTF-8编码为3字节0xe4b8ad.
        *//*


        byte[] bytes1="Hello".getBytes();//ISO8859-1
        byte[] bytes2="Hello".getBytes("UTF-8");
        byte[] bytes3="Hello".getBytes("GBK");
        byte[] bytes4="Hello".getBytes(StandardCharsets.UTF_8);

        byte[] bytes5="Hello".getBytes("UTF-8");
        String s5=new String(bytes5,StandardCharsets.UTF_8);
        String s6=new String(bytes5,"GBK");

    }
}
*/
