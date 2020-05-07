package com.rjf.reg;

public class RegMain {
    public static void main(String[] args){
        System.out.println("2019".matches("20\\d\\d"));
    }









/*
    单个字符的匹配规则如下：

    正则表达式	        规则	            可以匹配
    A	                指定字符	        A
    \u548c	            指定Unicode字符	和
    .	                任意字符	        a，b，&，0
    \d	                数字0~9	        0~9
    \w	                大小写字母，数字和下划线	a~z，A~Z，0~9，_
    \s	                空格、Tab键	    空格，Tab
    \D	                非数字	        a，A，&，_，……
    \W	                非\w         	&，@，中，……
    \S	                非\s	            a，A，&，_，……

    多个字符的匹配规则如下：

    正则表达式	        规则          	可以匹配
    A*	                任意个数字符	    空，A，AA，AAA，……
    A+	                至少1个字符	    A，AA，AAA，……
    A?	                0个或1个字符	    空，A
    A{3}	            指定个数字符	    AAA
    A{2,3}	            指定范围个数字符	AA，AAA
    A{2,}	            至少n个字符	    AA，AAA，AAAA，……
    A{0,3}	            最多n个字符	    空，A，AA，AAA
 */

}
