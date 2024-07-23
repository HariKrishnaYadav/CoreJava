package com.hky.designPattern.abstracts.factory;

public class TraineeDoctor implements Profession{
    @Override
    public void print() {
        System.out.println("I am trainee doctor");
    }
}
