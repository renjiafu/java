package com.rjf.advance.io.buffered;


import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        System.out.println(br.readLine());

        br.close();
    }
}
