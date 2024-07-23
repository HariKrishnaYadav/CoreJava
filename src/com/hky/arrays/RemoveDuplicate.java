package com.hky.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,2,4,3,1).stream().distinct().sorted().toList();
            for (int i=list.size()-1;i>=0;i--){
                System.out.print(list.get(i)+" ");
        }
    }

}
