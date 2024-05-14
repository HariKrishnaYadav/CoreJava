package com.hky.oops;

public class Child extends Parent {
    public void run() {
        super.run();
        System.out.println("child run");
    }

    public void walk() {
        super.walk();
        System.out.println("child walk");
    }
}
