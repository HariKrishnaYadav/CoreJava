package com.hky.objects.designPattern.abstracts.factory;

public class Doctor implements Profession{
    @Override
    public void print() {
        System.out.println("I am doctor");
    }
}
