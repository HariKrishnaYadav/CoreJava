package com.hky.interview;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortBasedOnNumberOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 4, 4, 4, 6, 7, 7};
        Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .sorted((a, b) -> {
                    if (a.getValue() == b.getValue()) {
                        return a.getKey() - b.getKey();
                    } else {
                        return a.getValue().compareTo(b.getValue());
                    }
                })
                .forEach(entry -> {
                    for (int i = 0; i < entry.getValue(); i++) {
                        System.out.print(entry.getKey() + " ");
                    }
                });
    }
}
