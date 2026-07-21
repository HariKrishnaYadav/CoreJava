package com.hky.interview;

import java.util.*;
import java.util.stream.Collectors;

public class ErrorCounter {

    public static void main(String[] args) {

        List<String> logs = Arrays.asList(
                "2025-01-10 ERROR Database",
                "2025-01-10 INFO Login",
                "2025-01-10 ERROR Database",
                "2025-01-11 ERROR Server",
                "2025-01-11 ERROR Database"
        );

        Map<String, Map<String, Long>> result = logs.stream()
                .map(log -> log.split("\\s+"))
                .filter(parts -> parts[1].equals("ERROR"))
                .collect(Collectors.groupingBy(
                        parts -> parts[0], // Date
                        LinkedHashMap::new,
                        Collectors.groupingBy(
                                parts -> parts[2], // Error Type
                                LinkedHashMap::new,
                                Collectors.counting()
                        )
                ));

        result.forEach((date, errors) -> {
            System.out.println("Date: " + date);
            errors.forEach((error, count) ->
                    System.out.println(error + " = " + count));
            System.out.println();
        });
    }
}