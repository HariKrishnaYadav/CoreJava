package com.hky.interview.java8.basic;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNumberOfOccurence {
    static void main(String[] args) {
        String str="basgdhjehwyiudjs";
        Arrays.stream(str.split("")).collect(Collectors.groupingBy(f->f, Collectors.counting())).entrySet().stream().forEach(k->{
            System.out.println(k.getKey()+"  "+k.getValue());


            Arrays.stream(str.split("")).collect(Collectors.groupingBy(f->f, LinkedHashMap::new , Collectors.counting())).entrySet().stream().filter(p ->p.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);

        });
    }
}
