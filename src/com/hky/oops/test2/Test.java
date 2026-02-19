package com.hky.oops.test2;
//Static methods are class-level
//
//They are hidden, not overridden
//
//Binding happens at compile time
class Parent {
    static void show() {
        System.out.println("Parent Static");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child Static");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
