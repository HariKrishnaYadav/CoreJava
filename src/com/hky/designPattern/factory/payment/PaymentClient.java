package com.hky.designPattern.factory.payment;

public class PaymentClient {
    private  PaymentProcess paymentProcess;
    public PaymentClient(PaymentFactory paymentFactory){
        paymentProcess=paymentFactory.getPayment();
    }
    public void doPayment(){
        paymentProcess.paymentProcess();
    }
}
