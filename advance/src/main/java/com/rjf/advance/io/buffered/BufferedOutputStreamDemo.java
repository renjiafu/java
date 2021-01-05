package com.rjf.advance.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {

    public static void main(String[] args) throws Exception {

        BufferedOutputStream bis = new BufferedOutputStream(new FileOutputStream("a.txt"));
        byte[] bytes = "ABC".getBytes();
        bis.write(bytes);
        bis.flush();
        bis.close();
    }
}
