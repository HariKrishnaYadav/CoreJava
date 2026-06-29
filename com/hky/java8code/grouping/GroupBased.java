package com.hky.java8code.grouping;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBased {

    public static void main(String[] args) {
        List<String> list = List.of(
                "Java", "Spring", "API", "Microservice",
                "AWS", "Docker", "Kubernetes", "Kafka",
                "Redis", "PostgreSQL"
        );

        Map<Integer, List<String>> result =
                list.stream()
                        .collect(Collectors.groupingBy(String::length));

        System.out.println(result);
        System.out.println("-----");
        System.out.println(list.stream().count());
        System.out.println("----------");
        list.stream().collect(Collectors.groupingBy(String::length)).forEach((k,v)->{
            System.out.println(("List::"+k.byteValue()+" "+v.stream().toList()));
        });

        list.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);


        String longest = list.stream()
                .max(Comparator.comparing(String::length))
                .orElse("");
        System.out.println("------");
        System.out.println(longest);
        System.out.println("---------");
        String shortest = list.stream()
                .min(Comparator.comparing(String::length))
                .orElse("");

        System.out.println(shortest);
        System.out.println("------");
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


        System.out.println("------");

        list.stream()
                .filter(s -> s.startsWith("K"))
                .forEach(System.out::println);


        System.out.println("-------");
        int total = list.stream()
                .mapToInt(String::length)
                .sum();

        System.out.println(total);

        System.out.println("-------");

        Map<Boolean, List<String>> result1 =
                list.stream()
                        .collect(Collectors.partitioningBy(s -> s.length() > 5));

        System.out.println(result1);

    }

}
