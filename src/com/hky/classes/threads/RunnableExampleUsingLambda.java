package com.hky.classes.threads;

public class RunnableExampleUsingLambda {
    public static void main(String[] args) {
        Runnable runnable=()->{
            System.out.println("inside:"+Thread.currentThread().getName());
        };
        //Thread thread=new Thread(runnable);
        //thread.start();
        new Thread(runnable).start();

    }
}
