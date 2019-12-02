package com.rjf.multithreading;

public class ThreadSynchronized  {
    public static void main(String[] args) throws Exception{
        Thread add=new AddThread();
        Thread dec=new DecThread();

        add.start();
        dec.start();

        add.join();
        dec.join();

        Thread.sleep(1000);

        System.out.println(Counter1.count);
    }
}

class Counter1{
    public  static final Object lock=new Object();
    public  static int count=0;
}

class AddThread extends Thread{
    public void run(){
        for (int i = 0; i < 10000; i++) {
            synchronized(Counter1.lock) {
                Counter1.count++;
            }
        }
    }
}

class DecThread extends Thread{
    public void run(){
        for (int i = 0; i < 10000; i++) {
            synchronized(Counter1.lock) {
                Counter1.count--;
            }
        }
    }
}

        /*

        多线程同时读写共享变量时，会造成逻辑错误，因此需要通过synchronized同步；

        同步的本质就是给指定对象加锁，加锁后才能继续执行后续代码；

        注意加锁对象必须是同一个实例；

        对JVM定义的单个原子操作不需要同步。
        */
