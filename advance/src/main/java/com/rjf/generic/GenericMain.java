package com.rjf.generic;

public class GenericMain {
    public static void main(String[] args){

        Pair<String> pair=new Pair<>();
        pair.setFirst("hello");
        System.out.println(pair.getFirst());

        Pair<Integer> pair1=new Pair<>();
        pair1.setFirst(123);
        System.out.println(pair1.getFirst());
/*

        部分反射API是泛型，例如：Class<T>，Constructor<T>；

        可以声明带泛型的数组，但不能直接创建带泛型的数组，必须强制转型；

        可以通过Array.newInstance(Class<T>, int)创建T[]数组，需要强制转型；

        同时使用泛型和可变参数时需要特别小心。

*/

    }
}
