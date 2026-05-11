package com.hky.objects.designPattern.factory.payment;

public class PaytmImpl implements PaymentFactory{
    @Override
    public PaymentProcess getPayment() {
        return new Paytm();
    }
}
