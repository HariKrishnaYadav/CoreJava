package com.hky.java8code.grouping;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "API", "Microservice", "AWS", "Docker");

        Map<String, List<String>> grouped = list.stream()
                .collect(Collectors.groupingBy(s -> {
                    if (s.length() <= 3) return "SMALL";
                    else if (s.length() <= 6) return "MEDIUM";
                    else return "LARGE";
                }));

        System.out.println(grouped);
    }
}