package com.hky.designPattern.abstracts.factory;

public class Teacher implements Profession{
    @Override
    public void print() {
        System.out.println("I am teacher");
    }
}
