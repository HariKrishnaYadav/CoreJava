package cmo.hky.java8code.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class MinMax {
    public static void main(String[] args) {
        String str[]={"Apple","Orange","Banana","Pineapple"};
        System.out.println(  Arrays.stream(str).min(String::compareTo).get());
        Arrays.stream(str).min(String::compareTo).ifPresent(min-> System.out.println("Min element: "+min));
        Arrays.stream(str).max(String::compareTo).ifPresent(max-> System.out.println("Max element: "+max));
        List<String> list = Arrays.asList("Mohit", "Nilesh", "Shankar", "Brajesh");
        list.stream().min(Comparator.comparing(String::length))
                .ifPresent(e -> System.out.println("Min: " + e));
        list.stream().max(Comparator.comparing(String::length))
                .ifPresent(e -> System.out.println("Min: " + e));

        String output = list.stream()
                .filter(e -> e.startsWith("S")) // Vijay, Vinod
                .findFirst()
                .orElse("NA");
        System.out.println(output);
    }
}
