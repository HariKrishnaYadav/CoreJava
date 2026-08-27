package com.hky.interview.java8.basic;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FindNonRepeatingIndex {
    public static void main(String[] args) {
        String str="swiss";
        int res = Arrays.stream(str.split("")).collect(Collectors.groupingBy(f -> f, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() > 1).map(entry->str.indexOf(entry.getKey())).findFirst().orElse(-1);

        System.out.println(res);
    }
}
