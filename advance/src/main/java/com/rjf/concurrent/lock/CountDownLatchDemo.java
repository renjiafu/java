package com.rjf.concurrent.lock;

/*
 *
 *   Rene
 *   2020/6/9 20:31
 */

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService pool = Executors.newFixedThreadPool(2);
        CountDownLatch latch = new CountDownLatch(2);

        pool.submit(new Worker(latch));
        pool.submit(new Worker(latch));

        latch.await(1, TimeUnit.SECONDS);

        System.out.println("辅助线程全部执行完毕!");
    }

    static class Worker implements Runnable{
        private CountDownLatch countDownLatch;

        public Worker(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
            countDownLatch.countDown();
        }
    }
}
