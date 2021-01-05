package com.rjf.advance.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {

        // 日期时间
        Date date = new Date();

        System.out.println(date.getYear() + 1900);    //  年
        System.out.println(date.getMonth() + 1);      //  月
        System.out.println(date.getDate());           //  日

        //  String
        System.out.println(date.toString());
        //  GMT时区
        System.out.println(date.toGMTString());
        //  本地时区
        System.out.println(date.toLocaleString());

        //  格式化
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));

    }
}
