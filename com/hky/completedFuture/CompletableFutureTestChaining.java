package com.hky.completedFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTestChaining {
    public static void main(String[] args) throws Exception {

        CompletableFuture<Integer>   future=CompletableFuture.supplyAsync(()->{
            return 10;
        });

        future.thenApplyAsync(result->{
            return result+10;
        }).thenApplyAsync(result->{
            return result*10;
        }).thenAccept(result->{
            System.out.println(result);
        });
        System.out.println(future.get());
    }


}
