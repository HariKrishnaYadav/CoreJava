package cmo.hky.java8code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String str = "hare krishna hare krishna krishna krishna hare hare".replaceAll("\\s+", "");

        Map<Character, Long> charCountMap = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCountMap);
        charCountMap.entrySet().stream().forEach(entry -> {
            if (entry.getValue() > 1)
                System.out.println("Character: " + entry.getKey() + " Count: " + entry.getValue());
        });
        System.out.println("-----------------------------");
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil","Pen", "Stapler", "Note Book", "Pencil");
        stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().forEach(entry -> {
            if (entry.getValue() > 1)
                System.out.println("Stationery: " + entry.getKey() + " Count: " + entry.getValue());
        });
        System.out.println("-----------------------------");
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("-----------------------------");
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));

        System.out.println(joinedString);
        System.out.println("-----------------------------");
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int max = listOfIntegers.stream().max(Integer::compareTo).get();

        System.out.println("Maximum Element : "+max);

        int min = listOfIntegers.stream().min(Integer::compare).get();

        System.out.println("Minimum Element : "+min);

        System.out.println("-----------------------------");
        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();

        System.out.println(Arrays.toString(c));
        System.out.println("-----------------------------");
        int[] a1 = new int[] {4, 2, 5, 1};

        int[] b2 = new int[] {8, 1, 9, 5};

        int[] c2 = IntStream.concat(Arrays.stream(a1), Arrays.stream(b2)).sorted().distinct().toArray();

        System.out.println(Arrays.toString(c2));
    }


}



