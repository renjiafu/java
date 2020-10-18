package com.rjf.exception;

import java.io.File;

public class TryCatchDemo {

    public static void main(String[] args){
        try {
            File file = new File("C:/a.txt");
        } catch (Exception e) {
            System.out.println("IO error");
        } finally {
            System.out.println("END");
        }
    }

}
