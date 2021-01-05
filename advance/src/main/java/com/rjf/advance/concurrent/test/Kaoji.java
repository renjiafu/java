package com.rjf.advance.concurrent.test;

/*
 *
 *   Rene
 *   2020/6/13 1:22
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Kaoji {

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(100);

        for (int i = 0; i < 100 ; i++) {
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    for (;;){
                        System.out.println(Thread.currentThread().getName());
                    }
                }
            });

        }
    }
}
