package cmo.hky.java8code.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 2, 7,6,7,8,9,1,1);
        List<Integer> duplicate=new ArrayList<>();
        list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry ->{
                        duplicate.add(entry.getKey());
                });
        System.out.println("Duplicate numbers: " + duplicate);
                }
}
