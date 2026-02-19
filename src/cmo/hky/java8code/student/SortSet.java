package cmo.hky.java8code.student;

import java.util.HashSet;
import java.util.Set;

public class SortSet {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();
        set.add(new Student(1, "Mahesh", 12));
        set.add(new Student(2, "Suresh", 15));
        set.add(new Student(3, "Nilesh", 10));

    }
}
