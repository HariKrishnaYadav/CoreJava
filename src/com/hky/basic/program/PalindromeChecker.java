package com.hky.basic.program;

public class PalindromeChecker {
    public static void main(String[] args) {
        String testString = "A man, a plan, a canal, Panama";
        boolean result = isPalindrome(testString);
        System.out.println("Is the string \"" + testString + "\" a palindrome? " + result);
    }

    private static boolean isPalindrome(String testString) {
        boolean status = false;
        String cleaned = testString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println("cleaned::::" + cleaned);
        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;


    }
}
