package com.hky.designPattern.factory.payment;

public class PhonePeImpl implements  PaymentFactory{
    @Override
    public PaymentProcess getPayment() {
        return new PhonePe();
    }
}
