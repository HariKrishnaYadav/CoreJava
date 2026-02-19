package cmo.hky.java8code.forEach;

import java.util.stream.Stream;

public class ForEachTest {
    public static void main(String[] args) {
        Stream.of("A","B","C","D").forEach(p->System.out.println(p));
        System.out.println("-------------------");
        Stream.of("A","B","C", "D")
                .forEachOrdered(e -> System.out.println(e));
    }
}
