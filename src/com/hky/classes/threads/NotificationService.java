package com.hky.classes.threads;

public class NotificationService implements Runnable {
    public void run() {
        System.out.println("Notification Sending by " + Thread.currentThread().getName());
    }
}