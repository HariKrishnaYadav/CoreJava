package com.hky.leetcode.strings.test;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String[] words={"ad","bd","aaab","baa","badab"};
        String allowed="ab";
        Set<Character> all=new HashSet<>();
        for(var s:allowed.toCharArray()){
            all.add(s);

        }

        Set<Character> set=new HashSet<>();
        for(var word:words){
            for (char c:word.toCharArray()){
                set.add(c);
                System.out.println(set);
            }

        }

        System.out.println(set);

    }
}
