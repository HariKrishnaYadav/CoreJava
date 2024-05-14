package com.hky.threads;

public class MainThread {
    public static void main(String[] args) {
        Thread thread1=new NumberPrinter();
        Thread thread2=new LetterPrinter();
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
