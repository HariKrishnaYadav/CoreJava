package cmo.hky.java8.practice.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinandMax {
    public static void main(String[] args) {
        System.out.println("---Min and Max for Integer---");
        List<Integer> numList = Arrays.asList(50,42, 44, 43, 41);

        numList.stream().max(Comparator.comparing(Integer::intValue)).ifPresent(e -> System.out.println("Max:" + e));
        numList.stream().min(Comparator.comparing(Integer::intValue)).ifPresent(e -> System.out.println("Min:" + e));
        System.out.println("---Min and Max for String---");
        List<String> list = Arrays.asList("Harekrishna","Mohit", "Nilesh", "Shankar", "Brajesh");
        list.stream().min(Comparator.comparing(String::valueOf))
                .ifPresent(e -> System.out.println("Min: " + e));

        list.stream().max(Comparator.comparing(String::valueOf))
                .ifPresent(e -> System.out.println("Max: " + e));
    }
}
