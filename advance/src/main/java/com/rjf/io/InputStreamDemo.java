package com.rjf.io;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo {
    public static void main(String[] args) throws Exception {

        InputStream inputStream=new FileInputStream("./a.txt");
        try{
            int n;
            while ((n = inputStream.read())!=-1){
                System.out.println(Character.toChars(n));
            }
        }finally{
            inputStream.close();
        }

        /*
            Java标准库的java.io.InputStream定义了所有输入流的超类：

            FileInputStream实现了文件流输入；

            ByteArrayInputStream在内存中模拟一个字节流输入。

            总是使用try(resource)来保证InputStream正确关闭。
        */
    }
}
