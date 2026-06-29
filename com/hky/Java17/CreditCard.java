package com.hky.Java17;

public sealed interface CreditCard permits SbiCreditCard,PnbCreditCard{
    void creditCardpymentprocess();
    default void test(){

    }

    static  void  staticTest(){

    }
}
