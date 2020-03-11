package com.rjf.concurrent.thread;


import java.util.concurrent.TimeUnit;

public class DeadLock {

    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {

        new Thread(() -> {
            try {
                while (true) {
                    synchronized (DeadLock.lock1) {
                        System.out.println(System.nanoTime() + "  Lock1 锁住线程 : " + Thread.currentThread().getName());
                        /*停顿一秒*/
                        TimeUnit.SECONDS.sleep(1);
                        synchronized (DeadLock.lock2) {
                            System.out.println(System.nanoTime() + "  Lock2 锁住线程 : " + Thread.currentThread().getName());
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                while (true) {
                    synchronized (DeadLock.lock2) {
                        System.out.println(System.nanoTime() + "  Lock2 锁住线程 : " + Thread.currentThread().getName());
                        /*停顿一秒*/
                        TimeUnit.SECONDS.sleep(1);
                        synchronized (DeadLock.lock1) {
                            System.out.println(System.nanoTime() + "  Lock2 锁住线程 : " + Thread.currentThread().getName());
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}
