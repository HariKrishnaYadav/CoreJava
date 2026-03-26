package com.hky.objects.designPattern.factory.payment;

public class PhonePeImpl implements  PaymentFactory{
    @Override
    public PaymentProcess getPayment() {
        return new PhonePe();
    }
}
