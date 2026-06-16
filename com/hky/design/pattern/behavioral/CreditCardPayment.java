package com.hky.design.pattern.behavioral;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment: " + amount);
    }
}