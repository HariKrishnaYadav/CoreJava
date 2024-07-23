package cmo.hky.java8.practice.concretepage;

import java.util.function.Predicate;

public class PredicteTest {
    public static void main(String[] args) {
        Predicate<String> test=s->s.startsWith("K");
        System.out.println(  test.test("krishna"));
    }
}
