package com.hky.completedFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletedFutureTest {
    public static void main(String[] args) throws Exception {
        CompletableFuture future=new CompletableFuture();
        new Thread(()->{
            future.complete("Hello");
        }).start();

        System.out.println(future.join());

        System.out.println("--------------");

        CompletableFuture<String> res=CompletableFuture.supplyAsync(()->{
            return "Hare krishna";

        });
        System.out.println(res.get());
        System.out.println("------");
        CompletableFuture<String> res1=CompletableFuture.supplyAsync(()->"hare").thenApply(String::toUpperCase);
        System.out.println(res1.get());

        System.out.println("-----");
        CompletableFuture.supplyAsync(()->"Consumes result").thenAccept(System.out::println).get();

        System.out.println("----");
        CompletableFuture.supplyAsync(() -> "Task")
                .thenRun(() -> System.out.println("Done"))
                .join();

        System.out.println("-------");
        CompletableFuture<Integer> f1 =
                CompletableFuture.supplyAsync(() -> 10);

        CompletableFuture<Integer> f2 =
                CompletableFuture.supplyAsync(() -> 20);

        CompletableFuture<Integer> result =
                f1.thenCombine(f2, Integer::sum);

        System.out.println(result.join());
    }
}
