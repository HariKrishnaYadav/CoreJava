package com.hky.interview.java8.basic;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupOfAnagram {
    static void main(String[] args) {
      String[]  words_list = {"eat", "tea", "tan", "ate", "nat", "bat"};
     Collection<List<String>> result=Arrays.stream(words_list).collect(Collectors.groupingBy(x->Arrays.stream(x.toLowerCase()
              .split("")).sorted().collect(Collectors.joining()))).values();
        System.out.println(result);
    }
}
