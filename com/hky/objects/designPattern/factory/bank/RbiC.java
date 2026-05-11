package com.hky.objects.designPattern.factory.bank;

public class RbiC extends RBI{
    @Override
    public Bank factoryMethode() {
        return new SBI();
    }
}
