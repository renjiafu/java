package com.rjf.advance.io;

import java.io.FileWriter;
import java.io.Writer;

public class WriterDemo {

    public static void main(String[] args) throws Exception{

        Writer writer=new FileWriter("./a.txt");
        writer.write('H');
        writer.close();


    /*
        Writer定义了所有字符输出流的超类：

        FileWriter实现了文件字符流输出；

        CharArrayWriter和StringWriter在内存中模拟一个字符流输出。

        使用try (resource)保证Writer正确关闭。

        Writer是基于OutputStream构造的，可以通过OutputStreamWriter将OutputStream转换为Writer，转换时需要指定编码。
    */
    }
}
