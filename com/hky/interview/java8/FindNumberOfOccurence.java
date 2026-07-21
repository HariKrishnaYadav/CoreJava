package com.hky.interview.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNumberOfOccurence {
    static void main(String[] args) {
        String str="I am learning java stream api java is good language for learning coding in java";

        Map<String, Long> res = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(f -> f, Collectors.counting()));
        System.out.println(res);
    }
}
