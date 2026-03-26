package com.hky.classes.threads;

public class InventoryService implements Runnable {
    public void run() {
        System.out.println("Inventory Updating by " + Thread.currentThread().getName());
    }
}
