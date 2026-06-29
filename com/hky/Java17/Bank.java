package com.hky.Java17;

public sealed class Bank permits SBI,PNB{
    void Deposite() {
        System.out.println("bank");
}
}
