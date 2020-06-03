package com.rjf.java8.stream;

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
        stream.filter(i->i%2 == 0).forEach(System.out::println);
    }
}
