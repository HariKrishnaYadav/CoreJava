package com.hky.interview;


import java.util.Comparator;
import java.util.List;

public class SortedTest {
    public static void main(String[] args) {
    List<Employee> list=TestEmployeeReturnClass.getEmployeesList();

    list.stream().sorted((e1,e2)->e1.getSalary().compareTo(e2.getSalary())).forEach(System.out::println);
        System.out.println("-------------------");
    list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).forEach(System.out::println);
        List<Double> distinctResult = list.stream().map(Employee::getSalary).distinct().toList();
        System.out.println("------");
        System.out.println(distinctResult);

        Double secondHigest = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).limit(1).map(Employee::getSalary).findFirst().orElse(null);
        list.stream().filter(e->e.getSalary().equals(secondHigest)).forEach(System.out::println);

        System.out.println("-------------------");
        list.stream()
                .filter(e -> e.getSalary().equals(
                        list.stream()
                                .map(Employee::getSalary)
                                .distinct()
                                .sorted(Comparator.reverseOrder())
                                .skip(1)
                                .findFirst()
                                .orElse(null)
                ))
                .forEach(System.out::println);
        System.out.println();
        list.stream().filter(e->e.getSalary()
                .equals(list.stream().map(Employee::getSalary).distinct()
                        .sorted(Comparator.reverseOrder()).skip(1)
                        .findFirst().orElse(null))).forEach(System.out::println);


    }
}
