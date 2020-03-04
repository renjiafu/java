package com.rjf.io;

import java.io.File;
import java.io.IOException;

public class MyFile {

    public static void main(String[] args) throws IOException {
        /*文件类*/
        File file=new File("./a.txt");
        if (!file.exists()){
            file.createNewFile();
        }

    }

}
