package com.hky.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramFinder1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "dog", "god", "tac", "act", "good");

        Collection<List<String>> anagramGroups = words.stream()
                .collect(Collectors.groupingBy(word -> {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }))
                .values();

        // Print the results
        System.out.println(anagramGroups);

        Map<String, List<String>> anagramMap =
                words.stream()
                        .collect(Collectors.groupingBy(word -> {
                            char[] chars = word.toCharArray();
                            Arrays.sort(chars);
                            return new String(chars);
                        }));

        // Print only actual anagram groups
        anagramMap.values().stream()
                .filter(group -> group.size() > 1)
                .forEach(System.out::println);
    }
    }
