package com.rjf.advance.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println(now.plusDays(1).plusHours(1).toString());    //  加1天,加1小时
        System.out.println(now.minusDays(1).toString());    //  减一天


    }


        /*
            数据库	    对应Java类（旧）	    对应Java类（新）
            DATETIME	java.util.Date	    LocalDateTime
            DATE	    java.sql.Date	    LocalDate
            TIME	    java.sql.Time	    LocalTime
            TIMESTAMP	java.sql.Timestamp	LocalDateTime
        */

}
