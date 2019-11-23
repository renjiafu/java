package com.rjf.regularandexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupReg {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
        pattern.matcher("010-12345678").matches(); // true
        pattern.matcher("021-123456").matches(); // true
        pattern.matcher("022#1234567").matches(); // false
        // 获得Matcher对象:
        Matcher matcher = pattern.matcher("010-12345678");
        if (matcher.matches()) {
            String whole = matcher.group(0); // "010-12345678", 0表示匹配的整个字符串
            String area = matcher.group(1); // "010", 1表示匹配的第1个子串
            String tel = matcher.group(2); // "12345678", 2表示匹配的第2个子串
            System.out.println(area);
            System.out.println(tel);
        }
    }

/*

    正则表达式用(...)分组可以通过Matcher对象快速提取子串：

    group(0)表示匹配的整个字符串；
    group(1)表示第1个子串，group(2)表示第2个子串，以此类推。

*/

}