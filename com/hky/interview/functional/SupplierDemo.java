package com.hky.interview.functional;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "Hello, Supplier!";
        System.out.println(stringSupplier.get());

        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get());

        Supplier<Integer> integerSupplier = () -> (int) (Math.random() * 100);
        System.out.println(integerSupplier.get());
    }
}
