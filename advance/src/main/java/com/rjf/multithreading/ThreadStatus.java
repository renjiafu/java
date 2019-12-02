package com.rjf.multithreading;

public class ThreadStatus {
    public static void main(String[] args) throws  Exception{

        /*
        New：新创建的线程，尚未执行；
        Runnable：运行中的线程，正在执行run()方法的Java代码；
        Blocked：运行中的线程，因为某些操作被阻塞而挂起；
        Waiting：运行中的线程，因为某些操作在等待中；
        Timed Waiting：运行中的线程，因为执行sleep()方法正在计时等待；
        Terminated：线程已终止，因为run()方法执行完毕。
       */

        Thread thread=new Thread(() -> {
            for (int i=0;i<10;i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("start");
        thread.start();
        thread.join(5000);
        System.out.println("end");



/*

        Java线程对象Thread的状态包括：New、Runnable、Blocked、Waiting、Timed Waiting和Terminated；

        通过对另一个线程对象调用join()方法可以等待其执行结束；

        可以指定等待时间，超过等待时间线程仍然没有结束就不再等待；

        对已经运行结束的线程调用join()方法会立刻返回。
*/


    }
}
