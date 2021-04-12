package com.rjf.start.array;

/**
 * des:可变参数
 *
 * @author Rene
 */
public class ArgsDemo {

    public static void main(String[] args) {

        for (String arg : args) {
            if ("-version".equals(arg)) {
                System.out.println("v 1.0");
                break;
            }
        }
    }
}
