package com.hky.string;

import java.util.*;

public class AnagramFinder {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "dog", "god", "tac", "act", "good");
        findAnagrams(words);
    }

    private static void findAnagrams(List<String> words) {
        Map<String ,List<String>> anagram=new HashMap<>();
            for (String word:words){
                char[] ch=word.toCharArray();
                Arrays.sort(ch);
                String sortedWord=new String(ch);
                if(anagram.containsKey(sortedWord)){

                  anagram.get(sortedWord).add(word);
                }else {
                    anagram.put(sortedWord, new ArrayList<>(Arrays.asList(word)));
                }
                for (List<String> anagramGroup : anagram.values()) {
                    if (anagramGroup.size() > 1) {
                        System.out.println(anagramGroup);
                    }
                }
            }
    }
}
