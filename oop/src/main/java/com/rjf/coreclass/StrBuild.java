package com.rjf.coreclass;

public class StrBuild {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(1024);
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(',');
            stringBuilder.append(i);
        }

        stringBuilder.append("xiaohua")
                .append("and")
                .append("Bob")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(stringBuilder.toString());
    }
}
