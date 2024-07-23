package com.hky.designPattern.abstracts.factory;

public class Engineer implements Profession{
    @Override
    public void print() {
        System.out.println("I am an engineer");
    }
}
