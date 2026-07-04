package com.hky.leetcode.strings;

import java.util.HashSet;
import java.util.Set;

public class CountConsistentStrings {

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        int count = countConsistentStrings(allowed, words);
        System.out.println("count::" + count);
    }

    private static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<Character> sets = new HashSet<>();
        for (var v : allowed.toCharArray()) {
            sets.add(v);
        }
        for (var word : words) {
            boolean consistent = true;
            for (var c : word.toCharArray()) {
                if (!sets.contains(c)) {
                    consistent = false;
                    break;

                }
            }
            if (consistent) {
                count++;
            }
        }

        return count;

    }
}
