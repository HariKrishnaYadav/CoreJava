package com.hky.interview;

public class Test {

    void methodA() {
        int i = 1;
       int b=methodB(i);
        System.out.println(i);
        System.out.println(b);
    }

    int methodB(int i) {
        return ++i;
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.methodA();
    }
}