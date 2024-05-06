package com.hky.threads;

public class FirstTechnique {
    public static void main(String[] args) {
        System.out.println("Main  thread");
       new FirstTask().start();
       Thread t=new FirstTask();
       t.start();
    }
}
