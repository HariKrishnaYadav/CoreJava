package com.hky.string;

import java.util.Scanner;

public class sentencePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your sentence:");
        String sentence = sc.nextLine();
        if (isPalindrom(sentence)) {
            System.out.println(sentence + " is palindrom");
        } else {
            System.out.println(sentence + " is not palindrom");
        }
    }

    private static boolean isPalindrom(String sentence) {
        String str = sentence.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;
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
