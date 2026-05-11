package com.hky.classes.threads;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        // Create multiple thread objects
        MyThread threadA = new MyThread();
        MyThread threadB = new MyThread();
        
        // You can set custom names for clarity
        threadA.setName("Thread A");
        threadB.setName("Thread B");


        threadA.sleep(1000);
        // Start the threads
        threadA.start();
        threadB.start();


        System.out.println("Main thread continues executing...");
    }
}
