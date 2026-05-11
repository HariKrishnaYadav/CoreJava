package com.hky.classes.threads;

public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running with Runnable: " + Thread.currentThread().getName());
    }
}
