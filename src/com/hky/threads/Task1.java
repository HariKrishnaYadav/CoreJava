package com.hky.threads;

public class Task1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("task1");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
