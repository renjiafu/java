package com.rjf.multithreading;

public class DeamonThread {
    public static void main(String[] args){
        Thread t = new Thread();
        t.setDaemon(true);
        t.start();
    }

    /*
    守护线程是为其他线程服务的线程；

    所有非守护线程都执行完毕后，虚拟机退出；

    守护线程不能持有需要关闭的资源（如打开文件等）。

    */
}
