package com.hky.designPattern.singleton;

public class
MainMethod {
    public static void main(String[] args) {
        Bank bank=Bank.getBank();
        System.out.println(bank.hashCode());
        Bank bank1=Bank.getBank();
        System.out.println(bank1.hashCode());
    }
}
