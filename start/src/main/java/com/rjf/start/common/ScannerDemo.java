package com.rjf.start.common;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            //double d1 = scanner.nextDouble();
            String s = scanner.nextLine();

            double d = 3.14159657;
            System.out.printf("%.2f\n", d);//两位小数输出
           // System.out.printf("%.4f\n", d1);//四位小数输出
            System.out.printf("%s\n", s);//string

            /*

                    占位符	说明
                    %d	格式化输出整数
                    %x	格式化输出十六进制整数
                    %f	格式化输出浮点数
                    %e	格式化输出科学计数法表示的浮点数
                    %s	格式化字符串
            */

        }
    }
}
