package cmo.hky.java8.practice.concretepage;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicProgram {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> uniqueStrngs = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueStrngs);

        System.out.println("===How do you find frequency of each character in a string using Java 8 streams?=====");{
            String inputString = "Java Concept Of The Day";
            Map<Character, Long> map = inputString.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            System.out.println(map);
            List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
            List<String> upperCase = colors.stream().map(String::toUpperCase).collect(Collectors.toList());
            System.out.println(upperCase);
            List<Integer> list=Arrays.asList(112, 234, 563, 199, 896, 1087);
            List<Integer> l = list.stream().filter(i -> i.toString().startsWith("1")).collect(Collectors.toList());
            System.out.println(l);
            List<Integer> intList=Arrays.asList(1,2,3,4,5,6,7,5,4,3,2,1,2,3,4,5);
    // intList.stream().mapToInt(s->s).sum();
            List<Integer> removeDuplicate = intList.stream().distinct().collect(Collectors.toList());
            System.out.println("removeDuplicate"+removeDuplicate);
           Set<Integer> set=new HashSet<>();
                     intList.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(x-> System.out.print(x+" "));

            System.out.println("===================");
           String str="Harekrishnayadav".toLowerCase();

            Map<String, Long> output = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            System.out.print("output:"+output);
            //repeated.entrySet().stream().forEach(e-> System.out.println(e.getKey()+""+e.getValue()));

            BiConsumer<Integer,Integer> bi=(a,b)-> System.out.println(a+b);
            bi.accept(6,8);
            Function<Integer,Integer> f=(a)->a/2;
            System.out.println(f.apply(10));

        }

    }

}
