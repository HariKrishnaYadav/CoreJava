package com.hky.objects.designPattern.factory.payment;

public class Paytm extends  PaymentProcess{
    @Override
    public void paymentProcess() {
        System.out.println("Payment processed using Paytm");
    }
}
