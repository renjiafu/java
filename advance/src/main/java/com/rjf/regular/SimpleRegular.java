package com.rjf.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegular {
    public static void main(String[] args){
        Pattern pattern=Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
        Matcher matcher=pattern.matcher("010-12345678");
        if (matcher.matches()){
            String s1= matcher.group(1);
            String s2= matcher.group(2);

            System.out.println(s1+"\n"+s2);

        }else {
            System.out.println("fail!");
        }
    }
}
