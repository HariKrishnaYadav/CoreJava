package com.hky.interview;

import java.util.Arrays;
import java.util.List;

public class FlatMapTest {
    public static void main(String[] args) {
        List<Integer> listEven = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> listOdd = Arrays.asList(1, 3, 5, 7, 9);
        List<List<Integer>> listOfList = Arrays.asList(listEven, listOdd);
        System.out.println("List of List: " + listOfList);
        List<Integer> mergedList = listOfList.stream().flatMap(l -> l.stream()).distinct().toList();
        System.out.println("Merged List: " + mergedList);

    }
}
