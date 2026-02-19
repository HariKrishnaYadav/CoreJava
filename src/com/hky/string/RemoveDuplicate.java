package com.hky.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
       String str="harekrishna";

       str.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).forEach(System.out::print);
        System.out.println();
        System.out.println("--------remove duplicate from list-----------------");
        List<String> listOfStrings = Arrays.asList("Peter", "John", "Mathew", "Pete", "John", "Mathew");
        listOfStrings.stream().distinct().collect(Collectors.toList()).forEach(l->System.out.println(l));
        System.out.println("----count number of duplicate elements in the list-----");
           Map<String,Long>   count=listOfStrings.stream()
                      .collect(Collectors.groupingBy(e->e,Collectors.counting()));
        System.out.println(count);
        System.out.println(" use Function.identity() method");

        Map<String,Long>   count1=listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(count1);

        count1.entrySet().stream()
                .filter(e->e.getValue()>1)
                .forEach(e-> System.out.println("Element "+e.getKey()+" has "+e.getValue()+" duplicates"));




    }
}
