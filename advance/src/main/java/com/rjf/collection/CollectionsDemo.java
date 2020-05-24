package com.rjf.collection;

/*
 *
 *   Rene
 *   2020/5/24 21:40
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("ccc");
        list1.add("bbb");
        list1.add("aaa");

        Collections.sort(list1);
        System.out.println(list1);
    }
}
