package com.hky.string;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
       String str="harekrishna";

       str.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).forEach(System.out::print);






    }
}
