package com.rjf.reg;

public class ComplexReg {
    public static void main(String[] args){
        String re = "learn\\s(java|php|go)";
        System.out.println("learn java".matches(re));
        System.out.println("learn Java".matches(re));
        System.out.println("learn php".matches(re));
        System.out.println("learn Go".matches(re));
    }



/*

    正则表达式	        规则	            可以匹配
    ^	                开头	            字符串开头
    $	                结尾	            字符串结束
    [ABC]	            […]内任意字符	    A，B，C
    [A-F0-9xy]	        指定范围的字符	A，……，F，0，……，9，x，y
    [^A-F]	            指定范围外的任意字符	非A~F
    AB|CD|EF	        AB或CD或EF	    AB，CD，EF

    */
}
