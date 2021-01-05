package com.rjf.advance.java8.stream;

/*
 *
 *   Rene
 *   2020/6/1 20:37
 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class FilterDemo {

    public static void main(String[] args) {

        int[] ints = {1,2,3,4,5,6};
        IntStream stream = Arrays.stream(ints);

        //  除二取模
        stream.filter(i->(i&1) == 0).forEach(System.out::println);
    }
}
