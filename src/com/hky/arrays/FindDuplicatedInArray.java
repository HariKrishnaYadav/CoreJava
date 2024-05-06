package com.hky.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicatedInArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 4, 6, 3, 7, 5, 8, 3, 6, 7, 3);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))) {
                Integer count = 1;
                map.put(list.get(i), list.get(count) + 1);
            } else {
                map.put(list.get(i), 1);

            }

        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > 1) {
                System.out.print(+m.getKey()+" ");
            }
        }
    }
}
