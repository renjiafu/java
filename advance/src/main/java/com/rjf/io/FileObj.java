package com.rjf.io;

import java.io.File;
import java.io.IOException;

public class FileObj {
    public static void main(String[] args) throws IOException {
        File file=new File("./a.txt");
        System.out.println(file);

        file.createNewFile();

    }

}
