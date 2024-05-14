package com.hky.threads;

public class Task2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("task2");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
