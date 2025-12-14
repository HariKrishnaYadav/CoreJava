package com.hky.designPattern.factory.payment;

public class PaytmImpl implements PaymentFactory{
    @Override
    public PaymentProcess getPayment() {
        return new Paytm();
    }
}
