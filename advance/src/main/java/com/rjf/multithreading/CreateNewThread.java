package com.rjf.multithreading;

public class CreateNewThread {
    public static void main(String[] args){

        Thread thread=new Thread();
        thread.start();

        Thread thread1=new MyThread();
        thread1.start();

        Thread thread2=new Thread(new MyRunable());
        thread2.start();

        new Thread(()->System.out.println("start new thread by lambda")).start();

    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("start new thread by extends thread");
    }
}

class MyRunable implements Runnable{

    @Override
    public void run() {
        System.out.println("Start new thread by impl Runnable!");
    }
}