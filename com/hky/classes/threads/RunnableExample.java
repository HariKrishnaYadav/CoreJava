package com.hky.classes.threads;

public class RunnableExample {
    public static void main(String[] args) {
        // Create multiple runnable tasks
        MyRunnable task1 = new MyRunnable();
        MyRunnable task2 = new MyRunnable();

        // Create threads and associate them with the tasks
        Thread t1 = new Thread(task1, "Thread-1");
        Thread t2 = new Thread(task2, "Thread-2");

        // Start the threads
        t1.start();
        t2.start();


        System.out.println("Main thread continues executing...");
    }
}
