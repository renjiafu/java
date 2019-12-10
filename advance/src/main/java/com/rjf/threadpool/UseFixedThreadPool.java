package com.rjf.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UseFixedThreadPool {

    public static void main(String[] args){
        ExecutorService executorService= Executors.newFixedThreadPool(8);

        for (int i=0;i<10;i++){
            executorService.submit(new Task("Task : "+i));

        }
        executorService.shutdown();
    }

}
class Task implements Runnable{

    private final String name;
    public Task(String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println("start task "+name);

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("end task:" +name);
    }
}
