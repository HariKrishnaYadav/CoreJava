package com.hky.oops.test;
//Parent constructor runs first
//
//It calls display()
//
//Due to runtime polymorphism, Child.display() is invoked
//
//But x is not initialized yet → default value 0
class Parent {
    Parent() {
        display();
    }

    void display() {
        System.out.println("Parent Display");
    }
}

class Child extends Parent {
    int x = 10;

    Child() {
        System.out.println("Child Constructor");
    }

    void display() {
        System.out.println("Child Display x = " + x);
    }
}

public class Test {
    public static void main(String[] args) {
        new Child();
    }
}
