package com.hky.designPattern.factory.bank;

public class FactoryMethod {
    public static void main(String[] args) {
      RBI rbip=new RbiPnb();
       rbip.factoryMethode().checkBalance();
       RBI rbiH=new RbiH();
       rbiH.factoryMethode().checkBalance();

    }
}
