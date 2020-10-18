package com.rjf.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchersDemo {

    public static void main(String[] args){

        Pattern pattern=Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
        Matcher matcher=pattern.matcher("010-12345678");

        // matches
        if (matcher.matches()){
            for (int i = 0; i <= matcher.groupCount(); i++) {
                System.out.println(i+" : "+ matcher.group(i));
            }
        }else {
            System.out.println("fail!");
        }

    }
}
