package com.hky.objects.designPattern.abstracts.factory;

public class MainClass {
    public static void main(String[] args) {
        AbstractFactory abstractFactory= new ProfessionAbstractFactory();
        abstractFactory.getFactory("teacher").print();
    }
}
