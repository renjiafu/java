package com.rjf.control;

public class BreakAndContinueDemo {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;// 下一次循环
            }
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0 && i > 0) {
                break;// 跳出
            }
            sum += i;
        }
        System.out.println(sum);

    }
}
