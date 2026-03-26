package cmo.hky.oops;

class A {
    static void method() {
        System.out.println("A method");
    }
}

class B extends A {
    static void method() {
        System.out.println("B method");
    }
}

public class Test {
    public static void main(String[] args) {
        A obj = new B();
        obj.method();
    }
}