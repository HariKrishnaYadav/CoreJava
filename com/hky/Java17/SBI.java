package com.hky.Java17;

public final class SBI extends Bank implements Payment{
    void Deposite(){
        System.out.println("sbi");
    }

    @Override
    public void paymentProcess() {
        System.out.println("SIB payment process");
    }
}
