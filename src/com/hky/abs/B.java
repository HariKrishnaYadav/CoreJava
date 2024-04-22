package com.hky.abs;

public class B extends A {
    static {
        i = --i - i--;
    }

    {
        i = ++i + i++;
    }
}