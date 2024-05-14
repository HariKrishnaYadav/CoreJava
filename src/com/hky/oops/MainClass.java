package com.hky.oops;

public class MainClass {
    static void overloadedMethod(A a) {
        System.out.println("ONE");
    }

    static void overloadedMethod(B b) {
        System.out.println("TWO");
    }

    static void overloadedMethod(Object obj) {
        System.out.println("THREE");
    }

    public static void main(String[] args) {
        C c = new C();
        A a=new C();
        A a1=new B();
        A a2=new A();
        overloadedMethod(a2);
        overloadedMethod(a1);
        overloadedMethod(a);
        overloadedMethod(c);
    }
}
