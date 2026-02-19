package com.hky.classes.threads.snchronized;

public class Shared {
    synchronized void sharedMethod(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Shared shared = new Shared();

        Thread t1 = new Thread(() -> {
            shared.sharedMethod();
        },
                "Thread-1");

        Thread t2 = new Thread(() -> {
            shared.sharedMethod();
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}
