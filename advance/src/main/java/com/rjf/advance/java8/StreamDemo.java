package com.rjf.advance.java8;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {

        /*十个随机数列表*/
        List<Integer> list = new Random().ints(0,10).limit(10).boxed().collect(Collectors.toList());

        System.out.println(list);

        /*逐个加10*/
        list.stream().map(i->i+10).collect(Collectors.toList()).forEach(System.out::println);
    }
}
