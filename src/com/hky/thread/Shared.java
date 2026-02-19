package com.hky.thread;

public class Shared {
    Thread t = Thread.currentThread();

    synchronized void methodOne(Shared s) {
        Thread t = Thread.currentThread();

        System.out.println(t.getName() + " is executing methodOne...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t.getName() + " is calling methodTwo...");

        s.methodTwo(this);

        System.out.println(t.getName() + " is finished executing methodOne...");
    }

    synchronized void methodTwo(Shared s) {
        Thread t = Thread.currentThread();

        System.out.println(t.getName() + " is executing methodTwo...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t.getName() + " is calling methodOne...");

        s.methodOne(this);

        System.out.println(t.getName() + " is finished executing methodTwo...");
    }

    public static void main(String[] args) {
        Shared obj1 = new Shared();
        Shared obj2 = new Shared();

        Thread thread1 = new Thread(() -> {
            obj1.methodOne(obj2);
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            obj2.methodTwo(obj1);
        }, "Thread-2");

        thread1.start();
        thread2.start();
    }
}

