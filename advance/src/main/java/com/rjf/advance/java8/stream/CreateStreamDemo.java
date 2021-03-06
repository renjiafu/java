package com.rjf.advance.java8.stream;

/*
 *
 *   Rene
 *   2020/6/1 20:05
 */

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class CreateStreamDemo {

    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("R","e","n","e");
        Stream<Integer> stream2 = Arrays.stream(new Integer[]{1,2,3});

        Pattern pattern = Pattern.compile("\\s+");
        Stream<String> stream3 = pattern.splitAsStream("12345 67 89");

        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);
        stream3.forEach(System.out::println);
    }

    /*

    Stream提供的常用操作有：

    转换操作：map()，filter()，sorted()，distinct()；

    合并操作：concat()，flatMap()；

    并行处理：parallel()；

    聚合操作：reduce()，collect()，count()，max()，min()，sum()，average()；

    其他操作：allMatch(), anyMatch(), forEach()。

     */
}
