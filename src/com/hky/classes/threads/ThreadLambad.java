package com.hky.classes.threads;

public class ThreadLambad {
    public static void main(String[] args) {
        Runnable runnable1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("taks1");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable runnable2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("taks2");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        new Thread(runnable1).start();
        new Thread(runnable2).start();


    }
}
