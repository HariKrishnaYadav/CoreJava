package cmo.hky.java8.practice.basic;

import java.util.Arrays;
import java.util.List;

public class ConvertStreamOfStringIntoArray {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D");
        String[] s = list.stream().toArray(String[]::new);

        for (String s1 : s) {
            System.out.print(s1 + " ");
        }
        System.out.println("--------------");
        Arrays.asList("Krishna", "Yadav", "Dev", "Kavya", "Kavi").stream().filter(e -> e.startsWith("K")).
                forEach(System.out::println);
        System.out.println("--------------");
        Arrays.asList(10, 20, 30, 40).stream().map(e->e*2).forEach(e-> System.out.print(e+" "));
    }
}
