package com.hky.designPattern.abstracts.factory;

public class MainClass {
    public static void main(String[] args) {
        AbstractFactory abstractFactory= new ProfessionAbstractFactory();
        abstractFactory.getFactory("teacher").print();
    }
}
