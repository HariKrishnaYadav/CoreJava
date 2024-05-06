package com.hky.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateFinder {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(9,4,6,3,7,5,8,3,6,7,3);
        HashSet<Integer> set = new HashSet<>();

        for (int i=0;i<list.size();i++){
            if(!set.add(list.get(i))){
                System.out.print("Duplicate Element: " +list.get(i)+",");
            }
        }
    }
}
