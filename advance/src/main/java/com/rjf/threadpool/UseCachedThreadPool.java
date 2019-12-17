package com.rjf.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UseCachedThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService=Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index=i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        System.out.println("线程 "+Thread.currentThread().getName()+"执行第 :"+index+"个任务");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }
}
