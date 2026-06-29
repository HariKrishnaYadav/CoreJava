package bin.com.hky.java21;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Java", "Spring", "API", "Microservice", "AWS", "Docker");

        Map<String, List<String>> grouped = list.stream()
                .collect(Collectors.groupingBy(s -> switch (s.length()) {
                    case 1, 2, 3 -> "SMALL";
                    case 4, 5, 6 -> "MEDIUM";
                    default -> "LARGE";
                }));

        System.out.println(grouped);
    }
}