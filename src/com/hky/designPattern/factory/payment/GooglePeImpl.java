package com.hky.designPattern.factory.payment;

public class GooglePeImpl implements PaymentFactory{
    @Override
    public PaymentProcess getPayment() {
        return new GooglePe();
    }
}
