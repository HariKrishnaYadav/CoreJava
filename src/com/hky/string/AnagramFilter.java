package com.hky.string;

import java.util.*;

public class AnagramFilter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("eat", "tea", "ate", "nap", "pan");
        List<List<String>> anagram = filterAnagram(words);
        System.out.println(anagram);
    }

    private static List<List<String>> filterAnagram(List<String> words) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String word : words) {
            String sortWord = sort(word);
            anagrams.computeIfAbsent(sortWord,k->new ArrayList<>()).add(word);
        }
        return new ArrayList<>(anagrams.values());
    }

    private static String sort(String word) {
        char[] chr = word.toCharArray();
        Arrays.sort(chr);
        return new String(chr);
    }
}
