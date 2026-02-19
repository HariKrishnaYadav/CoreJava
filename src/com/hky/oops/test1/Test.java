package com.hky.oops.test1;
//Overloading → Compile-time
//
//Reference type is A
//
//A has show(Object)
//
//Method selection happens before runtime
class A {
    void show(Object o) {
        System.out.println("Object");
    }
}

class B extends A {
    void show(String s) {
        System.out.println("String");
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new B();
        a.show("Hello");
    }
}
