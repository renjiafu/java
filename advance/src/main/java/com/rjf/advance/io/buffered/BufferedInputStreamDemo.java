package com.rjf.advance.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {

    public static void main(String[] args) throws Exception {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
        byte[] bytes = new byte[1024];
        bis.read(bytes);

        for (byte b:bytes ) {
            System.out.println(Character.toChars(b));
        }

        bis.close();
    }
}
