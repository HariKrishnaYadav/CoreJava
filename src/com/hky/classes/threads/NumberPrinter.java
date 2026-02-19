package com.hky.classes.threads;

public class NumberPrinter extends Thread{


    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread-1"+i);
        }
    }

}
