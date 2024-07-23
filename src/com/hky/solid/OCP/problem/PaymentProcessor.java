package com.hky.solid.OCP.problem;

public class PaymentProcessor {
    public void processPayment(Payment payment) {
        if (payment instanceof CreditCardPayment) {
            // process credit card payment
        } else if (payment instanceof PayPalPayment) {
            // process PayPal payment
        }
        // ...more payment types
    }
}
//In this scenario, adding a new payment type would require modifying the existing PaymentProcessor class, violating the OCP. Instead, we can use abstraction and polymorphism to achieve extensibility: