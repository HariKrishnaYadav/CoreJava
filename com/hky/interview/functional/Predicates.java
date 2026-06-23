package com.hky.interview.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(5)); // false

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        Predicate<Integer> isEven1 = n -> n % 2 == 0;

        numbers.stream()
                .filter(isEven1)
                .forEach(System.out::println);
    }
}
