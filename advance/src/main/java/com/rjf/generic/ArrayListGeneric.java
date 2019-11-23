package com.rjf.generic;

import java.util.ArrayList;

public class ArrayListGeneric {
    public static void main(String[] args){

        ArrayList<String> stringArrayList=new ArrayList<>();

        stringArrayList.add("hello");
        System.out.println(stringArrayList.get(0));
        /*
        泛型就是编写模板代码来适应任意类型；

        泛型的好处是使用时不必对类型进行强制转换，它通过编译器对类型进行检查；

        注意泛型的继承关系：可以把ArrayList<Integer>向上转型为List<Integer>（T不能变！），
        但不能把ArrayList<Integer>向上转型为ArrayList<Number>（T不能变成父类）。
        */

    }
}
