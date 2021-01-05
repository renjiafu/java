package com.rjf.start.array;

/**
 * <p>描述:可变参数</p>
 *
 * @author Rene
 * @date 2021/1/5 22:50
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
