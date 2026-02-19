package com.hky.classes.threads;

public class MainTask {
    public static void main(String[] args) {
        new Thread(new Task1()).start();

        new Thread(new Task2()).start();
    }
}
