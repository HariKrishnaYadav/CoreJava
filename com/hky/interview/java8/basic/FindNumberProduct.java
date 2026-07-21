package com.hky.interview.java8.basic;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindNumberProduct {
    static void main(String[] args) {
        int[] nums={3,4,5,6,7,8,9,77};
       int ans=Arrays.stream(nums).boxed().collect(Collectors.toList()).stream().limit(2).reduce(1,(a,b)->a*b);

        System.out.println(ans);
    }
}
