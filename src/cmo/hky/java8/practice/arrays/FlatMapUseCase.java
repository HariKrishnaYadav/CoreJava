package cmo.hky.java8.practice.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapUseCase {
    public static void main(String[] args) {
        List<Integer> primNoList = Arrays.asList(2, 3, 5, 7, 11);
        List<Integer> oldNoList = Arrays.asList(3, 5, 7, 9, 11);
        List<Integer> evenNoList = Arrays.asList(2, 4, 6, 8, 12);
        List<List<Integer>> listOfListofInts = Arrays.asList(primNoList, oldNoList, evenNoList);
        System.out.println(listOfListofInts);
        System.out.println("-------------------------");
        System.out.println(listOfListofInts.stream().distinct().toList());
        System.out.println("-------------------------");
        List<Integer> merglist = listOfListofInts.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
        System.out.println(merglist.stream().distinct().toList());
        merglist.stream().distinct().forEach(l->System.out.print(l+" "));

    }
}
