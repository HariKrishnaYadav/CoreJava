package com.hky.interfaces;

public interface Bank2 {
    void  deposit();
    default void msg(){
        System.out.println("Bank2");


    }
}
