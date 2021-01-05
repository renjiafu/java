package com.rjf.advance.reg;

/*
 *   贪婪 or 非贪婪
 *   Rene
 *   2020/5/31 15:28
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedRegDemo {

    public static void main(String[] args) {

        Pattern pattern1 = Pattern.compile("(\\d*)(0*)");
        Matcher matcher1 = pattern1.matcher("123000");

        if (matcher1.matches()){
            System.out.println("贪婪匹配");
            for (int i = 0; i <= matcher1.groupCount(); i++) {
                System.out.println(i+" : "+matcher1.group(i));
            }
        }

        Pattern pattern2 = Pattern.compile("(\\d*?)(0*)");
        Matcher matcher2 = pattern2.matcher("123000");
        if (matcher2.matches()){
            System.out.println("非贪婪匹配");
            for (int i = 0; i <= matcher2.groupCount(); i++) {
                System.out.println(i+" : "+matcher2.group(i));
            }
        }

    }
}
