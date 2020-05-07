package com.rjf.common;

/*
 *
 *   Rene
 *   2020/5/7 20:31
 */

public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Rene");
        stringBuffer.append(" is ");
        stringBuffer.append(" a ");
        stringBuffer.append(" boy ");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.reverse());

        System.out.println(stringBuffer.replace(0,2,"Xo")); //Xone is  a  boy
    }
}
