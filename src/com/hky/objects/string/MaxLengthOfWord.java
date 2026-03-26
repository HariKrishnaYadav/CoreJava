package com.hky.objects.string;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthOfWord {
    public static void main(String[] args) {
        String str = "Internal implementation of hashmap contains buckets";
        String[] words1 = str.split("\\s+");
        System.out.println(Arrays.stream(words1).max(Comparator.comparing(String::length)).get().length());

        // Split the string into words
        String[] words = str.split("\\s+");
        int maxLength = 0;
        String largWord=null;
        // Iterate through each word to find the maximum length
        for (String word : words) {
            int length = word.length();
            if (length > maxLength) {
                maxLength = length;
                largWord=word;

            }

        }
        System.out.println("Large word::"+largWord+" Maximum length of a word in the string: " + maxLength);
    }
}

