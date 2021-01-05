package com.rjf.advance.nio.base;

/*
 *
 *   Rene
 *   2020/8/10 22:20
 */

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsDemo {

    public static void main(String[] args) {

        Path path = Paths.get("./files/a.txt");
        System.out.println("path包含路径数 ---> "+path.getNameCount());
        System.out.println("path根路径 ---> "+path.getRoot());
        System.out.println("path绝对路径 ---> "+path.toAbsolutePath());

    }
}
