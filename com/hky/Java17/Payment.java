package com.hky.Java17;

public sealed interface Payment permits PNB,SBI{
    void paymentProcess();
}
