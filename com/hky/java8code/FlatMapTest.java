package com.hky.java8code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hare Krishna", "Rahul kumar", "Abhishek Yadav");
        list.forEach(System.out::println);
        System.out.println("-------");
        list.stream().flatMap(s -> Arrays.stream(s.split(" "))).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("--------");

        List<List<Integer>> arrayList = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );

        List<Integer> result = arrayList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(result);

        System.out.println("---------------");
        String str = "hare krishna";
        Arrays.stream(str.split(" ")).forEach(System.out::println);


        List<String> words = Arrays.asList("java", "api");
        System.out.println("------Distinct character ");
        List<String> result1 = words.stream()
                .flatMap(word -> Arrays.stream(word.split(" ")))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result1);

        System.out.println("--------");

        List<String> sentences = Arrays.asList(
                "I love java",
                "Java is powerful");

               List<String> resultList=sentences.stream().flatMap(word->Arrays.stream(word.split(" "))).collect(Collectors.toList());
                sentences.stream().forEach(System.out::println);

        System.out.println(resultList);

        System.out.println("------");
        List<Integer> nums = Arrays.asList(1,2);
        List<String> chars = Arrays.asList("A","B");
      List<String> res= nums.stream().flatMap(n->chars.stream().map(c->n+"-"+c)).collect(Collectors.toList());
        System.out.println(res);


    }
}
