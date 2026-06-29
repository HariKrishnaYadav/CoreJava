package com.hky.dsa.string;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWords {
    public static void main(String[] args) {
        String str = "Hello, world! This is a test string. Let's count the words.";
        String[] words = str.split("[^A-Za-z]+");
        System.out.println("Number of words: " + words.length);
        for (String word : words) {
            System.out.print(word + ",");
        }
        String repeatedWords = "Hello, world! This is a test string. Let's count the words. Hello, world!";
        String[] repeatedWordsArray = repeatedWords.split("[^A-Za-z]+");
        System.out.println("\nRepeated words:");
        Arrays.stream(repeatedWordsArray).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().forEach(k-> System.out.println(k.getKey()+"="+k.getValue()));

    }
}
