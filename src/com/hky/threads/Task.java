package com.hky.threads;

import java.util.concurrent.Callable;

public class Task implements Callable<String> {
    private String message;

    // Constructor of this class
    public Task(String message)
    {
        // This keyword refers to current instance itself
        this.message = message;
    }

    // Method of this Class
    public String call() throws Exception
    {
        return "Hiiii " + message + "!";
    }
}
