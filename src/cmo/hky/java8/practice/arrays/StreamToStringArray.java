package cmo.hky.java8.practice.arrays;

import java.util.Arrays;
import java.util.List;

public class StreamToStringArray {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hare", "Krishna", "Kavi", "Yadav", "Kaple");
        list.stream().filter(l -> l.startsWith("K")).forEach(System.out::println);
        System.out.println("----------------------");
        String[] arr=list.stream().filter(l->l.startsWith("K")).toArray(size->new  String[size]);
         for (String a:arr){
             System.out.println(a);
         }
    }
}
