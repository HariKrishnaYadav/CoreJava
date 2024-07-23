package com.hky.designPattern.factory.bank;

public class SBI extends Bank {
    @Override
    public void checkBalance() {
        System.out.println("SBI");
    }
}
