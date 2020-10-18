package com.rjf.nio.base;

/*
 *
 *   Rene
 *   2020/8/10 22:25
 */

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDemo {

    public static void main(String[] args) throws Exception{

        Path file = Files.createFile(Paths.get("a.txt"));
        Files.copy(file,new FileOutputStream("b.txt"));
    }
}
