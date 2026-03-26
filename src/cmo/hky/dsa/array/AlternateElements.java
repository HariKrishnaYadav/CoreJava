package cmo.hky.dsa.array;

import java.util.stream.IntStream;

import static java.util.stream.StreamSupport.intStream;

public class AlternateElements {

    private static void printAlternateElements(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }

    }
    private static void printAlternateElementsUsingJava8(int[] arr) {
        IntStream.range(0, arr.length)
                .filter(i -> i % 2 == 0)
                .map(i -> arr[i])
                .forEach(i -> System.out.print(arr[i] + " "));
    }
    private static void getRecursive(int[] arr) {


    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printAlternateElements(arr);
        printAlternateElementsUsingJava8(arr);
        getRecursive(arr);
    }



}
