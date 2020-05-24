package com.rjf.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {

    public static void main(String[] args) {

        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }


            /*
            数据库	    对应Java类（旧）	    对应Java类（新）
            DATETIME	java.util.Date	    LocalDateTime
            DATE	    java.sql.Date	    LocalDate
            TIME	    java.sql.Time	    LocalTime
            TIMESTAMP	java.sql.Timestamp	LocalDateTime
            */

}
