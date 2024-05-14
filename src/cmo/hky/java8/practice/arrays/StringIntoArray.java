package cmo.hky.java8.practice.arrays;

import java.util.Arrays;
import java.util.List;

public class StringIntoArray {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("A", "B", "C", "D");
        String[] arr = list.stream().toArray(String[]::new);
        for (String s:arr){
            System.out.print(s+" ");
        }
    }
}
