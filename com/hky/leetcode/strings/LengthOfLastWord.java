package com.hky.leetcode.strings;

public class LengthOfLastWord {

    public static void main(String[] args) {

        test("hare krishna yadav");
        test("hare krishna yadav------");
        test("hare krishna -----yadav");
        test("hare krishna -----yadav------");
        test("hare    krishna     yadav");
        test("      hare krishna yadav      ");
        test("------");
        test("");
        test("      ");
        test("hare-krishna-yadav");
    }

    public static void test(String str) {

        System.out.println("Input : \"" + str + "\"");

        if (str == null || str.trim().isEmpty()) {
            System.out.println("Length of last word : 0");
            System.out.println("--------------------------------");
            return;
        }

        String[] words = str.trim().split("\\s+");

        String lastWord = words[words.length - 1];

        // Remove leading and trailing hyphens only
        lastWord = lastWord.replaceAll("^-+|-+$", "");

        System.out.println("Last Word : " + lastWord);
        System.out.println("Length    : " + lastWord.length());
        System.out.println("--------------------------------");
    }
}