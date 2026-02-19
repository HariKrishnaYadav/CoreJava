package com.hky.oops.test4;
//Private methods are not inherited
//
//Parent.show() is called
//
//Child.show() is a new method, not override
//
//📌 Key Point:
//
//Private methods cannot be overridden.
class Parent {
    private void show() {
        System.out.println("Parent");
    }

    void call() {
        show();
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.call();
    }
}
