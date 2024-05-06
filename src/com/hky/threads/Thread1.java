package com.hky.threads;

public class Thread1 {
    public static void main(String[] args) {
        Runnable runnable=()->{
            System.out.println("....");

        };
       Thread thread=new Thread(runnable);
       thread.start();

    }
}
