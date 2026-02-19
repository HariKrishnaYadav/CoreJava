package cmo.hky.java8code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8Code {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> oddEvenNumbersMap =
                listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 != 0));
        System.out.println(oddEvenNumbersMap);

        Set<Map.Entry<Boolean, List<Integer>>> entrySet = oddEvenNumbersMap.entrySet();
        for (Map.Entry<Boolean, List<Integer>> entry : entrySet) {
            if (entry.getKey()) {
                System.out.println("Even Numbers");
            } else {
                System.out.println("Odd Numbers");
            }
            System.out.println("--------------");

            List<Integer> list = entry.getValue();

            for (int i : list)
            {
                System.out.println(i);
            }
        }
        System.out.println("===================find duplicate=========================");
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        List<String> uniqueStrngs = listOfStrings.stream().distinct().collect(Collectors.toList());

        System.out.println(uniqueStrngs);
        System.out.println("~~~~~~~~~How do you find frequency of each character in a string using Java 8 streams?~~~~~~~");
        String inputString = "Java Concept Of The Day";
        //Map<Character ,Integer> charCountMap=inputString.chars().mapToObj()
    }
}
