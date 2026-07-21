package com.hky.interview.java8.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DivideEvenOddNumber {

    static void main(String[] args) {
        Integer number[]={1,2,3,4,5,6,7,8,7,8,9,0,12,34,567};
        Map<String, List<Integer>> result = Arrays.stream(number).collect(Collectors.groupingBy(i -> i % 2 == 0 ? "even" : "odd"));
        System.out.println(result);
        Map<Boolean, List<Integer>> result1 = Arrays.stream(number).collect(Collectors.partitioningBy(i -> i % 2 == 0 ));
        System.out.println(result1.get(true));
        System.out.println(result1.get(false));

        int num[]={1,2,3,4,5,6,7,8,7,8,9,0,12,34,567};
        Arrays.stream(num).boxed().collect(Collectors.groupingBy(x->x%2==0,Collectors.toList())).entrySet().stream().forEach(k->{
            System.out.println(k.getKey()+"  "+k.getValue());
        });

    }
}
