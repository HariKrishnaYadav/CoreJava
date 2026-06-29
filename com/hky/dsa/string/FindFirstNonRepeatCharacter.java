package com.hky.dsa.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import  java.util.LinkedHashMap;

public class FindFirstNonRepeatCharacter {
    public static void main(String[] args) {
        String s="geeksforgeeks";
        Character result = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() > 1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println("result:"+result);
    }
}
