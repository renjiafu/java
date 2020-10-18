package com.rjf.reg;

/*
 *
 *   Rene
 *   2020/7/12 19:01
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindDemo {

    public static void main(String[] args) {

        String str = "155-7343-0984";
        Matcher matcher = Pattern.compile("\\d+").matcher(str);

        // find
        while (matcher.find()){
            System.out.println("start ---> "+matcher.start());
            System.out.println("命中 ---> "+matcher.group());
            System.out.println("end ---> "+matcher.end());
        }
    }
}
