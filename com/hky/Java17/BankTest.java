package com.hky.Java17;

public class BankTest {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.Deposite();

        Bank b1=new SBI();
        b1.Deposite();
        SBI sbi=new SBI();
        sbi.paymentProcess();

        Bank b2=new PNB();
        b2.Deposite();
        PNB pnb=new PNB();
        pnb.paymentProcess();

    }
}
