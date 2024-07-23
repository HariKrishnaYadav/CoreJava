package com.hky.exception;

public class BadMethodException {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            badMethod();
            System.out.println("B");
        } catch (Exception ex) {
            System.out.println("C");
        } finally {
            System.out.println("D");
        }
    }

    private static void badMethod() {
        throw new Error();
    }
}
