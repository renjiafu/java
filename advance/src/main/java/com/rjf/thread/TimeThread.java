package com.rjf.thread;

public class TimeThread {
    int a = 0;


    public static void main(String[] args) {
        TimeThread timeThread = new TimeThread();

        new Thread(() -> {
            timeThread.operate(timeThread);
        }).start();
        new Thread(() -> {
            timeThread.operate(timeThread);
        }).start();

    }

    public void operate(TimeThread timeThread) {
        for (; ; ) {
            a++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a--;
            System.out.println("a:" + timeThread.a);
        }

    }


}
