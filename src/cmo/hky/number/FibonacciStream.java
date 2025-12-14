package cmo.hky.number;

import java.util.stream.Stream;

public class FibonacciStream {
    public static void main(String[] args) {
        int max = 50;

        Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
              .map(n -> n[0])
              .takeWhile(n -> n <= max)
              .forEach(n -> System.out.print(n + " "));
    }
}
