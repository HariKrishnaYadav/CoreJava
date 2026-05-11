package com.hky.objects.designPattern.factory.payment;

public class GooglePeImpl implements PaymentFactory{
    @Override
    public PaymentProcess getPayment() {
        return new GooglePe();
    }
}
