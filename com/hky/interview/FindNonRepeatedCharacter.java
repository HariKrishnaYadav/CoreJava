package com.hky.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "abccbaacz";
          str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                  .entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst().ifPresent(System.out::println);
    }

    }

