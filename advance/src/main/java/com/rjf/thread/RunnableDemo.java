package com.rjf.thread;

public class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo(String name){
        threadName=name;
        System.out.println("Creating"+threadName);
    }
    public void run(){
        System.out.println("Running"+threadName);
        try{
            for(int i=4;i>0;i--){
                System.out.println("thread:"+threadName+","+i);

                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("thread "+threadName+" exiting!");
    }
    public void start(){
        System.out.println("Starting "+threadName);
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}

class TestThread{
    public static void main(String[] args){
        RunnableDemo r1=new RunnableDemo("thread-1");
        r1.start();

        RunnableDemo r2=new RunnableDemo("thread-2");
        r2.start();
    }
}
