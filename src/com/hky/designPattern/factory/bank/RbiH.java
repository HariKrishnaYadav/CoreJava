package com.hky.designPattern.factory.bank;

public class RbiH extends RBI{
    @Override
    public Bank factoryMethode() {
        return new HDFC();
    }
}
