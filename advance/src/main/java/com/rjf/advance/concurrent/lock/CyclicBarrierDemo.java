package com.rjf.advance.concurrent.lock;

/*
 *
 *   Rene
 *   2020/6/9 20:37
 */

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(3);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        pool.submit(new Worker(cyclicBarrier));
        pool.submit(new Worker(cyclicBarrier));
        pool.submit(new Worker(cyclicBarrier));

        System.out.println("全部提交!");

    }

    static class Worker implements Runnable {
        private CyclicBarrier cyclicBarrier;

        public Worker(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {

                try {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    System.out.println("当前等待线程数 : " + cyclicBarrier.getNumberWaiting());
//                    TimeUnit.SECONDS.sleep(1);
                    cyclicBarrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
