package com.rjf.java8;

public class LambdaDemo {

    public static void main(String[] args) {
        Print<String> p = s->System.out.println(s);
        p.print("Rene");
    }

    public interface Print<T> {
        void print(T t);
    }
}
