package com.hky.objects.designPattern.factory.payment;

public class PhonePe extends PaymentProcess{
    @Override
    public void paymentProcess() {
        System.out.println("Payment processed using PhonePe");
    }
}
