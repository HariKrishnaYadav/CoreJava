package com.hky.interview.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "krishna yadav";
          str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                  .entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst().ifPresent(System.out::println);

        String res = Arrays.stream(str.split("")).collect(Collectors.groupingBy(f -> f, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
                .filter(i -> i.getValue() == 1).map(Map.Entry::getKey).skip(2).findFirst().orElse(null);
        System.out.println(res);
    }

    }

