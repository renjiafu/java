package com.rjf.io;

import java.io.FileReader;
import java.io.Reader;

public class ReaderDemo {

    public static void main(String[] args) throws Exception{

        Reader reader=new FileReader("./a.txt");
        for (;;){
            int n=reader.read();
            if (n == -1){
                break;
            }
            System.out.println((char)n);
        }
        reader.close();
    }
}


    /*

            Reader定义了所有字符输入流的超类：

            FileReader实现了文件字符流输入，使用时需要指定编码；
            CharArrayReader和StringReader可以在内存中模拟一个字符流输入。
            Reader是基于InputStream构造的：可以通过InputStreamReader在指定编码的同时将任何InputStream转换为Reader。

            总是使用try (resource)保证Reader正确关闭。

    */
