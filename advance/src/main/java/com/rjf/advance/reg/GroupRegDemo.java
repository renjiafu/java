package com.rjf.advance.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupRegDemo {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("(\\d{4}):(\\d{2}):(\\d{2})");
        Matcher matcher = compile.matcher("2020:01:01");

        if (matcher.matches()){

                System.out.println(matcher.group(1)+"年");
                System.out.println(matcher.group(2)+"月");
                System.out.println(matcher.group(3)+"日");
        }
    }


    /*

        正则表达式用(...)分组可以通过Matcher对象快速提取子串：

        group(0)表示匹配的整个字符串；
        group(1)表示第1个子串，group(2)表示第2个子串，以此类推。

    */
}


