package cmo.hky.java8.practice.concretepage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D");
        String[] strArray = list.stream().toArray(String[]::new);
        for(String s : strArray) {
            System.out.println(s);

        }
        System.out.println("=================================================");
        List<String> list1 = Arrays.asList("Krishna", "Mahesh", "Kush");
        String[] strArray1 = list1.stream()
                .filter(e -> e.startsWith("K")).toArray(size->new String[size]);
        for(String s : strArray1) {
            System.out.println(s);

        }
        System.out.println("=================================================");

        Stream.of("C", "B", "D", "F", "E", "A")
                .sorted()// A,B,C,D,E,F
               .skip(2) //C,D,E,F
                .forEach(System.out::println);
        System.out.println("=================================================");
        Stream.of("9","8","7","6","5","3","2").sorted().forEach(System.out::println);
       String str="harekrishna";


    }
}
