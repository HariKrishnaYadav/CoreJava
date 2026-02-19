package cmo.hky.java8code.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonNull {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", null, "Bob", null, "Charlie");
        List<String> nonNullNames = names.stream()
                .filter(name -> name != null)
                .toList();
        nonNullNames.forEach(System.out::println);
        System.out.println("---Using flatMap to remove nulls-----");
        nonNullNames.stream().flatMap(Stream::ofNullable).collect(Collectors.toList());
        nonNullNames.forEach(System.out::println);
        System.out.println("----Using Objects.nonNull to remove nulls-----");
        names.stream().filter(Objects::nonNull).toList().forEach(e-> System.out.println(e));

        System.out.println("----Another way using flatMap-----");
        names.stream().flatMap(Stream::ofNullable).toList().forEach(e-> System.out.println(e));




        System.out.println("----- collectingAndThen example-----");
        List<String> fruits = Arrays.asList("apple", "banana", "orange");

        Map<Integer, String> result1 = fruits.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toMap(fruits::indexOf, String::toUpperCase),
                        Collections::unmodifiableMap
                ));
        String str="hare krishna you are great";
        long l=str.chars().filter(i->i =='a').count();
        System.out.println("Count of 'a': "+l);


        System.out.println(result1);
        //System.out.println("----Flattening a list of lists while removing null lists-----");
        //List<List<String>> data = List.of(List.of("A", "B"), null, List.of("C"));
        //List<String> result = data.stream()
         //       .flatMap(Stream::ofNullable)   // removes null lists
         //       .flatMap(List::stream)         // flattens lists
         //       .toList();
        //result.forEach(e -> System.out.println(e));

        List<Integer> list=Stream.iterate(1,x-> x+1).limit(2000).toList();

        long start=System.currentTimeMillis();
    List<Integer>    fList=list.stream().map(x->factorial(x)).toList();
        long end=System.currentTimeMillis();
        System.out.println("Time taken in sequential processing: "+(end-start)+" ms");

        long start1=System.currentTimeMillis();
        List<Integer>    pList=list.parallelStream().map(x->factorial(x)).toList();
        long end1=System.currentTimeMillis();
        System.out.println("Time taken in parallel processing: "+(end1-start1)+" ms");
    }

    private static Integer factorial(int n){
        if (n==0)
            return 1;
        else
            return n*factorial(n-1);
    }
}
