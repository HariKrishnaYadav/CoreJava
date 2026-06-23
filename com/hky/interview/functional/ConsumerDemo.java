package com.hky.interview.functional;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer   consumer=(x)-> System.out.println(x);
        consumer.accept("Hello, Consumer!");
        Consumer consumer1=System.out::println;
        consumer1.accept("Hello, Consumer with method reference!");
        Consumer consumer2= x-> System.out.println(x.toString().toUpperCase());
        consumer2.accept("Hello, Consumer with uppercase!");
        Consumer consumer3= x-> System.out.println(x.toString().length());
        consumer3.accept("Hello, Consumer with length!");
        Consumer<Integer> consumer4= x-> System.out.println(x*x);
        consumer4.accept(5);
    }
}
