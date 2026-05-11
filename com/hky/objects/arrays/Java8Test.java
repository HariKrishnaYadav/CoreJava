package com.hky.objects.arrays;

import java.util.*;
import java.util.stream.Collectors;


public class Java8Test {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //filtering even numbers
        List<Integer> evenNumbers=list.stream().filter(n->n%2==0).toList();
        System.out.println("Even numbers :"+evenNumbers);
        Integer min = list.stream().min(Integer::compareTo).get();
        System.out.println("Minimum :"+min);
        Integer max = list.stream().max(Integer::compareTo).get();
        System.out.println("Maximum :"+max);
        String str[]={"hello","world","java","stream"};
        Arrays.stream(str).map(String::toUpperCase).forEach(t->{
            System.out.println(t);
        });
        List<Integer> groupedByEvenOdd = list.stream().collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"))
                .entrySet().stream().flatMap(entry -> entry.getValue().stream()).toList();
        System.out.println("Grouped by Even and Odd :"+groupedByEvenOdd);
        System.out.println("------------------------------");
        List<String>  fruitList = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        Map<Integer, List<String>> groupedByLength = fruitList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by length :"+groupedByLength);
        System.out.println("---------------palindrome---------------");

        

    }


}
