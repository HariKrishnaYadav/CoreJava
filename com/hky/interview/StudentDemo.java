package com.hky.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentDemo {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(1, "Anand", "Computer Science", 9.2),
                new Student(2, "Rahul", "Mechanical", 7.8),
                new Student(3, "Amit", "Electronics", 8.7),
                new Student(4, "Neha", "Computer Science", 9.5),
                new Student(5, "Priya", "IT", 8.3),
                new Student(6, "Karan", "Civil", 7.9)
        );

        students.stream()
                .filter(s -> s.getCgpa() > 8.0)
                .sorted((s1, s2) -> Double.compare(s2.getCgpa(), s1.getCgpa()))
                .limit(3)
                .forEach(System.out::println);
        System.out.println("-------------------------");

        Map<String, Double> avgCgpa =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getName,
                                Collectors.averagingDouble(Student::getCgpa)
                        ));

        avgCgpa.entrySet().stream()
                .filter(e -> e.getValue() > 8.0)
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(3)
                .forEach(System.out::println);
    }
}