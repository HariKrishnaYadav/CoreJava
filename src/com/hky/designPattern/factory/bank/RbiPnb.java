package com.hky.designPattern.factory.bank;

public class RbiPnb extends RBI {
    @Override
    public Bank factoryMethode() {
        return new PNB();
    }
}
