package com.hky.classes.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderProcessing {
    public static void main(String[] args) {




        System.out.println("Executing all service Tasks...");
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(new PaymentService());
        executor.submit(new InventoryService());
        executor.submit(new NotificationService());

        executor.shutdown();
    }
}
