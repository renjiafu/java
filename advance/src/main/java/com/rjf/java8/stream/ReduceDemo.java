package com.rjf.java8.stream;

/*
 *
 *   Rene
 *   2020/6/1 20:40
 */

import java.util.stream.Stream;

public class ReduceDemo {

    public static void main(String[] args) {

        Integer reduce = Stream.of(1, 2, 3, 4, 5).reduce(0, (sum, n) -> sum + n);
        System.out.println(reduce);
    }
}
