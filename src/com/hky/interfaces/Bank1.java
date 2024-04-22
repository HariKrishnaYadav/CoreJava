package com.hky.interfaces;

public interface Bank1 {
    void  deposit();
    default void msg(){
        System.out.println("Bank1");


    }
}
