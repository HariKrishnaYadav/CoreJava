package com.hky.design.pattern.behavioral;

public class UpiPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment: " + amount);
    }
}