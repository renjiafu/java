package com.rjf.advance.java8.stream;

/*
 *
 *   Rene
 *   2020/6/1 20:30
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        stream.map(i -> i * i).forEach(System.out::println);

        List<String> strings = new ArrayList<>();
        strings.add(" aaa ");
        strings.add(" BBB ");
        strings.add(" CcC ");

        strings.stream()
                .map(String::trim)
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
