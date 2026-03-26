package com.hky.objects.string.palindrome;

import java.util.Arrays;
import java.util.List;

public class Palindrome {


    public static void main(String[] args) {

        List<String> Palindrome = Arrays.asList("madam", "racecar", "hello", "level", "world");
        List<String> checkPalindrome = Palindrome.stream().filter(s -> s.equals(new StringBuilder(s).reverse().toString())).toList();
        System.out.println("Palindromes :" + checkPalindrome);
        String p = "abba";
        boolean isPalindrome = p.equals(new StringBuilder(p).reverse().toString());
        System.out.println("Is '" + p + "' a palindrome? " + isPalindrome);
        String sentencePalindrome = "Too hot to hoot.";
        checkSentencePalindrome(sentencePalindrome);
        System.out.println(countPalin("Madam " + "Arora teaches malayalam"));
        System.out.println(countPalin("Nitin " + "speaks malayalam"));
    }



    private static void checkSentencePalindrome(String sentencePalindrome) {
        String cleanedSentence = sentencePalindrome.replaceAll("[^a-zA-Z]", "").toLowerCase();
        boolean isPalindrome = cleanedSentence.equals(new StringBuilder(cleanedSentence).reverse().toString());
        System.out.println("Is '" + sentencePalindrome + "' a palindrome? " + isPalindrome);

    }
    private static boolean countPalin(String s) {

        return false;
    }
}
