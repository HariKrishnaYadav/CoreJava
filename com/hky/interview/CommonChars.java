package com.hky.interview;

import java.util.*;
import java.util.stream.*;

public class CommonChars {
    public static void main(String[] args) {
        String s1 = "harekrishanji";
        String s2 = "mr.krishnayadav";

        Set<Character> set2 = s2.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());

        s1.chars()
          .mapToObj(c -> (char) c)
          .distinct()
          .filter(set2::contains)
          .forEach(System.out::println);
    }
}