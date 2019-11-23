package com.rjf.io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Out {
    public static void main(String[] args)  throws Exception{
        OutputStream outputStream=new FileOutputStream("./a.txt");
        outputStream.write(65);
        outputStream.close();

/*
        Java标准库的java.io.OutputStream定义了所有输出流的超类：

        FileOutputStream实现了文件流输出；

        ByteArrayOutputStream在内存中模拟一个字节流输出。

        某些情况下需要手动调用OutputStream的flush()方法来强制输出缓冲区。

        总是使用try(resource)来保证OutputStream正确关闭。
 */
    }
}
