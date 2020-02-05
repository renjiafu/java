package com.rjf.datastructure.myarraylist;

public class Test {

    public static void main(String[] args) {

        List list = new MyArrayList(2);

        list.add(1);
        list.add(2);
        list.add(3);


        System.out.println("size : "+list.size());
        System.out.println(list.get(0));
        System.out.println(list.toString());

    }
}
