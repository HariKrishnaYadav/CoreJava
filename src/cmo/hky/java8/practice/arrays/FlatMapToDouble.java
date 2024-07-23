package cmo.hky.java8.practice.arrays;

import java.util.Arrays;
import java.util.List;

public class FlatMapToDouble {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);

        // Using Stream map(Function mapper) and
        // displaying the corresponding new stream

        list.stream().map(number -> number + number).forEach(System.out::println);
    
    }
}
