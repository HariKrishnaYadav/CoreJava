package cmo.hky.dsa.array;

import java.util.*;
import java.util.stream.*;

public class SubarraysStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        List<List<Integer>> result =
            IntStream.range(0, arr.length)
                .boxed()
                .flatMap(i ->
                    IntStream.range(i + 1, arr.length + 1)
                        .mapToObj(j ->
                            IntStream.range(i, j)
                                .mapToObj(k -> arr[k])
                                .collect(Collectors.toList())
                        )
                )
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
