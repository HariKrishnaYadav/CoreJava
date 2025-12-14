package com.hky.designPattern.factory.payment;

public class GooglePe extends PaymentProcess{
    @Override
    public void paymentProcess() {
        System.out.println("Payment processed using GooglePe");
    }
}
