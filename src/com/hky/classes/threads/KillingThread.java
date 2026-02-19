package com.hky.classes.threads;

public class KillingThread implements Runnable{

    // to stop the thread
    private boolean exit;

    private String name;
    Thread t;
    public KillingThread(String threadname) {

            name = threadname;
            t = new Thread(this, name);
            System.out.println("New thread: " + t);
            exit = false;
            t.start(); // Starting the thread


    }

    @Override
    public void run() {

    }
}
