package com.hky.designPattern.factory;

// Concrete Creators
class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        System.out.println("ConcreteCreatorA");
        return new ConcreteProductA();
    }
}
