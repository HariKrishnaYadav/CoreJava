package com.hky.thread;

public class Synchronized {
    synchronized void sharedMethod () {
        Thread t1 = Thread.currentThread();
        for(int i = 0; i < 5; i++) {
            System.out.println(t1.getName() + " is executing sharedMethod");
        }

    }
    public static void main(String[] args) {
        Synchronized obj = new Synchronized();

        Thread thread1 = new Thread(() -> {
            obj.sharedMethod();
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            obj.sharedMethod();
        }, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
