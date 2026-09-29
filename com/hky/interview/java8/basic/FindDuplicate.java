package com.hky.interview.java8.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
   public  static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 5, 1,2);
        Set<Integer>   set=new HashSet<>();
       List<Integer> res=nums.stream().filter(i->!set.add(i)).distinct().toList();
        System.out.println(res);


    }
}
