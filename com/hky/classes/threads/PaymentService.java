package com.hky.classes.threads;

public class PaymentService implements Runnable {
    public void run() {
        System.out.println("Payment Processing by " + Thread.currentThread().getName());
    }
}
