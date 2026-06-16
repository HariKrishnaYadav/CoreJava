package com.hky.executor;

import java.util.concurrent.Executor;

public class ExecutorTest {
    public static void main(String[] args) {
        Executor executor = command -> new Thread(command).start();
        executor.execute(() -> System.out.println("Task executed"));
    }
}
