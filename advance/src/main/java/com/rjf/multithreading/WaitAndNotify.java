package com.rjf.multithreading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class WaitAndNotify {

    public static void main(String[] args) throws InterruptedException {
        TaskQueue taskQueue=new TaskQueue();
        var ts=new ArrayList<Thread>();
        for (int i = 0; i < 5; i++) {
            var t=new Thread(){
                public void run(){
                    //执行Task
                    while(true){
                        try{
                            String s= taskQueue.getTask();
                            System.out.println("execute task: "+s);
                        }catch (InterruptedException e){
                            return;
                        }
                    }
                }
            };
            t.start();
            ts.add(t);
        }
        var add=new Thread(()->{
            for (int i = 0; i < 10; i++) {
                //放入task
                String s="t-" + Math.random();
                System.out.println("add task : "+s);
                taskQueue.addTask(s);
                try {
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        add.start();
        add.join();
        Thread.sleep(1000);
        for (var t:ts){
            t.interrupt();
        }

    }
}

class TaskQueue{
    Queue<String> queue=new LinkedList<>();

    public synchronized void addTask(String s){
        this.queue.add(s);
        this.notifyAll();
    }

    public synchronized String getTask() throws InterruptedException{
        while(queue.isEmpty()){
            this.wait();
        }
        return queue.remove();
    }
}
