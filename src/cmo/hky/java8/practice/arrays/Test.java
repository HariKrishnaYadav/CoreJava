package cmo.hky.java8.practice.arrays;

import java.util.Arrays;
import java.util.List;

public class Test {
    public void method1() {
        List<String> a = Arrays.asList("ABC", "BCD", "KGF");
        method2(a);
        for (String a1 : a) {
            System.out.println(a1);
        }
    }

    public void method2(List<String> b) {
        b.add("KLP");
//        for (String a1 : b) {
//            System.out.println(a1);
//        }
    }
}