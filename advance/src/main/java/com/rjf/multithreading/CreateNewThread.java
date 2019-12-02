package com.rjf.multithreading;

public class CreateNewThread {
    public static void main(String[] args){

        Thread thread=new Thread();
        thread.start();

        Thread thread1=new MyThread1();
        thread1.start();

        Thread thread2=new Thread(new MyRunable1());
        thread2.start();

        new Thread(()->System.out.println("start new thread by lambda")).start();

    }
}

class MyThread1 extends Thread{
    public void run(){
        System.out.println("start new thread by extends thread");
    }
}

class MyRunable1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Start new thread by impl Runnable!");
    }
}

        /*
        Java用Thread对象表示一个线程，通过调用start()启动一个新线程；

        一个线程对象只能调用一次start()方法；

        线程的执行代码写在run()方法中；

        线程调度由操作系统决定，程序本身无法决定调度顺序；

        Thread.sleep()可以把当前线程暂停一段时间。
        */
