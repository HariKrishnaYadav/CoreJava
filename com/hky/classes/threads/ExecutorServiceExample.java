package com.hky.classes.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads
        ExecutorService executor = Executors.newFixedThreadPool(3); //

        // Submit tasks (using a lambda expression for brevity) to the executor
        for (int i = 0; i < 5; i++) {
            final int taskID = i;
            executor.submit(() -> {
                System.out.println("Task " + taskID + " running in thread: " + Thread.currentThread().getName());
            });
        }

        // Shutdown the executor once all tasks are complete
        executor.shutdown(); //
    }
}
