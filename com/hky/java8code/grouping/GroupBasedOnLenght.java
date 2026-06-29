package com.hky.java8code.grouping;

import java.util.*;
import java.util.stream.Collectors;

public class GroupBasedOnLenght {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "API", "Microservice", "AWS", "Docker");

        Map<Integer, Long> groupedByLength = list.stream()
                .collect(Collectors.groupingBy(String::length,Collectors.counting()));

               groupedByLength.forEach((lenght,count)->System.out.println("Lenght: "+lenght+  " count:" +count));


        System.out.println("--------------------");

                Map<Integer, List<String>> grouped = list.stream()
                        .collect(Collectors.groupingBy(String::length));

                System.out.println(grouped);
                grouped.forEach((k,v)->{
                    System.out.println("group list:::"+v.stream().toList());
                });





    }
}