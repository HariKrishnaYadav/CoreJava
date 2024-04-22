package com.hky.interfaces;

public class Sbi implements  Bank1,Bank2{


    @Override
    public void deposit() {
        System.out.println("sbi");
    }

    @Override
    public void msg() {
        Bank2.super.msg();
    }



}
