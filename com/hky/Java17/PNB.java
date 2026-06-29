package com.hky.Java17;

public final class PNB extends Bank implements Payment{
    void Deposite(){
        System.out.println("pnb");
    }

    @Override
    public void paymentProcess() {
        System.out.println("PNB paymentProcess");
    }
}
