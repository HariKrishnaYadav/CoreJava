package com.hky.interview;

import java.util.List;

public class MapTest {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "orange", "grape", "kiwi");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        list.stream().map(String::length).forEach(System.out::println);
        list.stream().map(s -> s.substring(0, 3)).forEach(System.out::println);
        System.out.println("-------------------------");
        list.stream().filter(i->i.length()>5).map(String::toUpperCase).forEach(System.out::println);
        System.out.println("-------------------------");
        list.stream().filter(i->i.startsWith("b")).map(String::toUpperCase).forEach(System.out::println);


    }
}
