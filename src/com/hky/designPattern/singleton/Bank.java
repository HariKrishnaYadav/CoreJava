package com.hky.designPattern.singleton;

public class Bank {
    private  static  Bank bank;
   //please make constructor as private
    private  Bank() {
    }
    public  static  Bank getBank(){
        if(bank==null){
            bank=new Bank();
        }
        return  bank;
    }
}
