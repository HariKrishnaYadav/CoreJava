package com.hky.interview.java8.basic;

import java.util.Arrays;

import java.util.Collection;
import java.util.List;

public class StreamUseCase {
   public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("java", "spring"),
                Arrays.asList("docker", "k8")
        );
       list.stream().map(Collection::stream)
               .forEach(System.out::println);
        System.out.println("==============");
        list.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
