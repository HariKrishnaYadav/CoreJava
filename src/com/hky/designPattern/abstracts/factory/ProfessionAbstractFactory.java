package com.hky.designPattern.abstracts.factory;

public class ProfessionAbstractFactory  extends  AbstractFactory{
    @Override
    Profession getFactory(String factory) {
        Profession profession = null;
        if(factory.equals("teacher")){
            profession=new Teacher();
        } else if (factory.equals("doctor")) {
            profession=new Doctor();

        } else if (factory.equals("engineer")) {
            profession=new Engineer();

        }
        return profession;
    }
}
