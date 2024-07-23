package com.hky.solid.OCP.solution;
//With this design, adding a new payment type involves creating a new class implementing the Payment interface, ensuring that the PaymentProcessor remains closed for modification and open for extension.
public class PayPalPayment implements Payment{
    @Override
    public void processPayment() {

    }
}
