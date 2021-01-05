package com.rjf.advance.java8.stream;

/*
 *
 *   Rene
 *   2020/6/18 21:02
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {

    public static void main(String[] args) {

        List<String> lists = new ArrayList<>();
        lists.add("a");
        lists.add("aa");
        lists.add("aaa");
        lists.add("aaaa");
        lists.add("aaaaa");

        //  分组操作
        Map<Integer, List<String>> collect = lists.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);
    }
}

