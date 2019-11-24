package com.rjf.collection.thread;

public class DisplayMessage implements Runnable {
    private String message;
    public DisplayMessage(String message){
        this.message=message;
    }
    public void run(){
        while(true){
            System.out.println(message);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public static void main(String[] args){
       Thread dm1=new Thread(new DisplayMessage("线程1"));
       Thread dm2=new Thread(new DisplayMessage("线程2"));

       dm1.start();
       dm2.start();
    }
}
