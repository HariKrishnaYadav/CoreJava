package com.hky.interview.sorts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class RearrangeBasedOnElementOccurrence {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,1,1,3,3,4,4,4,6,7,7);


        Map<Integer, Long> freqMap = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        List<Integer> result = freqMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .flatMap(entry -> Collections.nCopies(entry.getValue().intValue(), entry.getKey()).stream())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}