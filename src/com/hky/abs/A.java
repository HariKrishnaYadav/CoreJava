package com.hky.abs;

public class A {
    static int i = 1111;

    static {
        i = i-- - --i;
    }

    {
        i = i++ + ++i;
    }
    void  m1(Integer b){

    }
    void  m1(String b){

    }
}
