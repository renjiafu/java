package com.rjf.multithreading;

public class Interrupt {
    public static void main(String[] args) throws Exception{
        Thread t = new MyThread3();
        t.start();
        Thread.sleep(1000);
        t.interrupt(); // 中断t线程
        t.join(); // 等待t线程结束
        System.out.println("main thread end!");

   /*     Thread t=new Thread4();
        t.start();
        Thread.sleep(2000);
        ((Thread4) t).running=false;
        System.out.println("main thread end!");*/


    }
}

class MyThread2 extends Thread{
        public void run(){
            int n=0;
            while(! isInterrupted()){
                n++;
                System.out.println("hello! "+n);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
}

class MyThread3 extends Thread {
    public void run() {
        Thread hello = new HelloThread();
        hello.start(); // 启动hello线程
        try {
            hello.join(); // 等待hello线程结束
        } catch (InterruptedException e) {
            System.out.println("interrupted!");
        }
        hello.interrupt();
    }
}

class HelloThread extends Thread {
    public void run() {
        int n = 0;
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

class Thread4 extends Thread{
    public volatile boolean running=true;
    public void run(){
        int n=0;
        while(running && n<10){
            n++;
            System.out.println("hello ! "+n);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("end!");
    }
}

/*

        对目标线程调用interrupt()方法可以请求中断一个线程，目标线程通过检测isInterrupted()标志获取自身是否已中断。如果目标线程处于等待状态，该线程会捕获到InterruptedException；

        目标线程检测到isInterrupted()为true或者捕获了InterruptedException都应该立刻结束自身线程；

        通过标志位判断需要正确使用volatile关键字；

        volatile关键字解决了共享变量在线程间的可见性问题。

*/
