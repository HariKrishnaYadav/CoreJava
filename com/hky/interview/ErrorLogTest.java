package com.hky.interview;

import java.util.LinkedHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ErrorLogTest {
    public static void main(String[] args) {
        List<ErrorLog> logs = Arrays.asList(
                new ErrorLog("2025-01-10", "ERROR", "Database"),
                new ErrorLog("2025-01-10", "INFO", "Login"),
                new ErrorLog("2025-01-10", "ERROR", "Database"),
                new ErrorLog("2025-01-11", "ERROR", "Server"),
                new ErrorLog("2025-01-11", "ERROR", "Database")
        );

        Map<String, Map<String, Long>> result = logs.stream()
                .filter(log -> "ERROR".equals(log.getLevel()) || "INFO".equalsIgnoreCase(log.getLevel()))
                .collect(Collectors.groupingBy(
                        ErrorLog::getDate,
                        LinkedHashMap::new,
                        Collectors.groupingBy(
                                ErrorLog::getErrorType,
                                LinkedHashMap::new,
                                Collectors.counting()
                        )
                ));

        result.forEach((date, errors) -> {
            System.out.println("Date: " + date);
            errors.forEach((type, count) ->
                    System.out.println(type + " = " + count));
            System.out.println();
        });
    }
}
