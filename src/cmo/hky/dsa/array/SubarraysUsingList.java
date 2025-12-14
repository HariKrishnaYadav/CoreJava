package cmo.hky.dsa.array;

import java.util.*;

public class SubarraysUsingList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        List<List<Integer>> subarrays = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                temp.add(arr[j]);
                subarrays.add(new ArrayList<>(temp));
            }
        }

        System.out.println(subarrays);
    }
}
