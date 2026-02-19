package cmo.hky.java8code.Stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToIntegerArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        Integer[] array = list.toArray(Integer[]::new);
        for (Integer l : array) {
            System.out.println(l);
        }
       int sum=list.stream().collect(Collectors.summingInt(i->i));
        System.out.println(sum);
    }
    List<Integer> list1 = Arrays.asList(1,2,3);
    List<Integer> list2 = Arrays.asList(4,5,6);
    Stream<Integer> resStream = Stream.concat(list1.stream(), list2.stream());
}
