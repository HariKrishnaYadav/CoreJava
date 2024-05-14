package com.hky.string;

import java.util.Scanner;

public class LongestPalindromeWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Madam Arora teaches Malayalam
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        String longestPalindromeWord = findLongestPalindromeWord(sentence);
        System.out.println("Longest palindrome word: " + longestPalindromeWord);
    }

    private static String findLongestPalindromeWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longestPalindrome = "";

        for (String word : words) {
            if (isPalindrome(word) && word.length() > longestPalindrome.length()) {
                longestPalindrome = word;
            }
        }
        return longestPalindrome;
    }

    private static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}

