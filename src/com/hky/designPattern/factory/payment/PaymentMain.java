package com.hky.designPattern.factory.payment;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentFactory phonePe= new PhonePeImpl();
        PaymentClient paymentClient = new PaymentClient(phonePe);
        paymentClient.doPayment();
        PaymentFactory  googlePay=new GooglePeImpl();
        PaymentClient paymentClient1=new PaymentClient(googlePay);
        paymentClient1.doPayment();
        PaymentFactory paytm=new PaytmImpl();
        PaymentClient paymentClient2=new PaymentClient(paytm);
        paymentClient2.doPayment();




    }

}
