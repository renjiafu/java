package com.rjf.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        MyRun myRun = new MyRun();
        executorService.submit(myRun);
        executorService.submit(myRun);
        executorService.submit(myRun);

        executorService.shutdown();


    }
}

class MyRun implements Runnable{

    private Object object= new Object();

    @Override
    public void run() {
        synchronized (object){
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
        }

    }
}