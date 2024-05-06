package com.hky.string;

import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your longest palindrom:");
        String longP = sc.nextLine();

        System.out.print("Longest Palindrom:" + findLonestPalindrom(longP));
    }

    private static String findLonestPalindrom(String longP) {
        String[] words= longP.split("\\s+");
        String longestPalindrom = "";

        for (String word : words) {
            if (isPalindrom(word) && word.length() > longestPalindrom.length()) {
                longestPalindrom = word;
            }
        }
        return longestPalindrom;
    }

    private static boolean isPalindrom(String l) {
        String str = l.toLowerCase();
        int left = 0;
        int right = l.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
