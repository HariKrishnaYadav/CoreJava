package com.hky.threads;

import java.util.concurrent.*;

public class TaskTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Task task=new Task("Hare krishna");
        ExecutorService executorService= Executors.newFixedThreadPool(4);
        Future<String> future=executorService.submit(task);
        System.out.println(future.get());
    }
}
