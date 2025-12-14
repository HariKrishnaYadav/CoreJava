package com.hky.designPattern.factory.payment;

public class PhonePe extends PaymentProcess{
    @Override
    public void paymentProcess() {
        System.out.println("Payment processed using PhonePe");
    }
}
