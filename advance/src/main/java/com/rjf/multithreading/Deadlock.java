package com.rjf.multithreading;

public class Deadlock {
    static final Object lockA=new Object();
    static final Object lockB=new Object();
    int count1=0;
    int count2=0;

    public static void main(String[] args){
        Deadlock deadlock=new Deadlock();

       Thread threadm=new Thread(new Runnable() {
           @Override
           public void run() {
               deadlock.add(10);
           }
       });
        Thread threadn = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock.dec(10);
            }
        });

        threadm.start();
        threadn.start();

       /* System.out.println(deadlock.count1);
        System.out.println(deadlock.count2);
*/

    }


    public void add(int m){
       synchronized(lockA){//获取A锁
           count1+=m;
           System.out.println("add c1 :"+count1);
           synchronized (lockB){//获取B锁
               count2+=m;
               System.out.println("add c2 :"+count2);
           }//释放B锁
       }//释放A锁
    }

    public void dec(int n){
       synchronized(lockB){//获取A锁
           count1-=n;
           System.out.println("dec c1 :"+count1);
           synchronized (lockA){//获取B锁
               count2-=n;
               System.out.println("dec c2 :"+count2);
           }//释放B锁
       }//释放A锁
    }


}
