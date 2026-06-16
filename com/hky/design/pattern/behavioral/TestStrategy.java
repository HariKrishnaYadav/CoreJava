package com.hky.design.pattern.behavioral;

public class TestStrategy {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CreditCardPayment());
        context.executePayment(100.0);

        context = new PaymentContext(new PayPalPayment());
        context.executePayment(200.0);

        context = new PaymentContext(new UpiPayment());
        context.executePayment(300.0);

    }
}
