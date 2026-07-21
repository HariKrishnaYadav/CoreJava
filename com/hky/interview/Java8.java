package com.hky.interview;

import java.util.*;
import java.util.stream.Collectors;

public class Java8 {
    static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 5, 1);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = nums.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet());

        System.out.println(duplicates); // [1, 2]
        System.out.println("----------Count frequency of each element---------");
        List<String> words = Arrays.asList("a", "b", "a", "c", "b", "a");

        Map<String, Long> freq = words.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        System.out.println(freq); // {a=3, b=2, c=1}


        List<Integer> nums1 = Arrays.asList(10, 25, 3, 47, 47, 18);

        System.out.println(
"----------Find second largest element---------");


        Optional<Integer> second = nums1.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(second.get()); // 25

        System.out.println("----------Check if a string is palindrome---------");
        String str = "madam";
        boolean isPalindrome = str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(isPalindrome); // true

        String s1 = "listen", s2 = "silent";


        }

    }



