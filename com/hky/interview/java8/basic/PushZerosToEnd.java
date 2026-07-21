package com.hky.interview.java8.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PushZerosToEnd {
    static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        List<Integer> res = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(x -> x == 0))
                .values().stream().flatMap(l -> l.stream()).toList();
        System.out.println(res);
    }
}
