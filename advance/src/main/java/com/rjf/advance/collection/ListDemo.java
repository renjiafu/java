package com.rjf.advance.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("apple");
        list.add("pear");
        System.out.println(list.size());

        //允许添加null
        list.add(null);
        System.out.println(list);
        list.add(null);
        System.out.println(list);
        list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("**********************");

        for (String s:list) {
            System.out.println(s);
        }

        System.out.println("**********************");

        for (Iterator<String> it=list.iterator();it.hasNext();){
            System.out.println(it.next());
        }

    }
}
