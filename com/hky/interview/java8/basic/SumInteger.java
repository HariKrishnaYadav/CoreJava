package com.hky.interview.java8.basic;

import java.sql.Array;
import java.util.Arrays;

public class SumInteger {
    static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8};
      Integer  sum=Arrays.stream(num).boxed().mapToInt(Integer::intValue).sum();
        System.out.println("sum::"+sum);
    }

}
