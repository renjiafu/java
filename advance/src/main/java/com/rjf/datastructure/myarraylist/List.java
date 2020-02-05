package com.rjf.datastructure.myarraylist;

public interface List {

    int size();

    Object get(int i);

    boolean isEmpty();

    int indexOf(Object o);

    void add(Object o);

    boolean addBefore(Object obj1,Object obj2);

    boolean addAfter(Object obj1,Object obj2);

    Object remove(int i);

    Object replace(int i,Object o);

    String toString();

}
