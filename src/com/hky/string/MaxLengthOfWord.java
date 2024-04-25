package com.hky.string;

public class MaxLengthOfWord {
    public static void main(String[] args) {
        String str = "Internal implementation of hashmap contains buckets";

        // Split the string into words
        String[] words = str.split(" ");
        int maxLength = 0;
        // Iterate through each word to find the maximum length
        for (String word : words) {
            int length = word.length();
            if (length > maxLength) {
                maxLength = length;
            }
        }
        System.out.println("Maximum length of a word in the string: " + maxLength);
    }
}

