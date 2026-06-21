package com.hky.interview.threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {

        public static void main(String[] args) throws ExecutionException, InterruptedException {
            CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello")
                    .thenApplyAsync(greeting -> greeting + " World")
                    .thenApplyAsync(message -> message + "!");
            System.out.println(future.get()); // Prints "Hello World!"
        }
    }

