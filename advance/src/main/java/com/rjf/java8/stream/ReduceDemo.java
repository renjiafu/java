package com.rjf.java8.stream;

/*
 *
 *   Rene
 *   2020/6/1 20:40
 */

import java.util.stream.Stream;

public class ReduceDemo {

    public static void main(String[] args) {

        Integer reduce = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0).reduce(0, (sum, n) -> sum + n);
        System.out.println(reduce);

        String str = Stream.of("a", "b", "c").reduce("", String::concat);
        System.out.println(str);
    }

    /*
    reduce用于约简数据
    */

}


