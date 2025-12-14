package com.hky.designPattern.factory.payment;

public class Paytm extends  PaymentProcess{
    @Override
    public void paymentProcess() {
        System.out.println("Payment processed using Paytm");
    }
}
