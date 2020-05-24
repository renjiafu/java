package com.rjf.concurrent.thread;

public class ThreadStartDemo {

    public static void main(String[] args) {

        //直接继承Thread类
        new MyThread().start();

        //函数式接口
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
        }).start();
    }
}

class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}