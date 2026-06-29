package com.hky.dsa.string;

import java.util.HashSet;
import java.util.Set;

public class PangramCheck {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";

        s = s.toLowerCase();
        Set<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }

        if (set.size() == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}