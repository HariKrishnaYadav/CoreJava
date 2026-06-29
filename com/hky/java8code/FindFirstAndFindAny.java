package com.hky.java8code;

import java.util.stream.Stream;

public class FindFirstAndFindAny {
    public static void main(String[] args) {
        Stream.of("one", "two", "three", "four")
                .parallel()
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("--------");

        Stream.of("one", "two", "three", "four")
                .findAny()
                .ifPresent(System.out::println);

        System.out.println("-----------");
        Stream.of("one", "two", "three", "four")
                .parallel()
                .findAny()
                .ifPresent(System.out::println);
    }
}
