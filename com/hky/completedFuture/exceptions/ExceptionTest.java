package com.hky.completedFuture.exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ExceptionTest {
    public static void main(String[] args) {
        CompletableFuture<Integer> res=CompletableFuture.supplyAsync(()->{
            return 10/0;
        });

        res.exceptionally(ex->{
            System.out.println("Exception occurred: " + ex.getMessage());
            return 0; // Default value to return if there's an exception.out.println("");
        }).thenAccept(result->{
            System.out.println("Result: " + result);
        });

        List<Integer> list= Arrays.asList(2,3,3,4,4,5,6);

        list.add(7);
    }
}
