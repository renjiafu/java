package com.rjf.exception;

public class AssertDemo {
    public static void main(String[] args) {
        double x = Math.abs(-123.45);
        assert x >= 0;
        System.out.println(x);

    }
}
