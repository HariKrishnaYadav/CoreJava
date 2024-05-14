package com.hky.designPattern.factory;

class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        System.out.println("ConcreteCreatorB");
        return new ConcreteProductB();
    }
}
