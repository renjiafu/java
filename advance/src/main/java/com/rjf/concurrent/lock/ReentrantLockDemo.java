package com.rjf.concurrent.lock;

/*
 *
 *   Rene
 *   2020/7/26 23:13
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();

        try {
            lock.lock();
            System.out.println("do something...");

            try {
                lock.lock();
                System.out.println("do something...");
                lock.unlock();
            }catch (Exception e){
                e.printStackTrace();
            }
            lock.unlock();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
