package com.hky.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestEmployee {


    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1L, "Rahul", "IT", "Male", 29, 85000.0, "Gurugram", 2020, true),
                new Employee(2L, "Priya", "HR", "Female", 32, 65000.0, "Delhi", 2018, true),
                new Employee(3L, "Amit", "Finance", "Male", 41, 120000.0, "Mumbai", 2015, true),
                new Employee(4L, "Sneha", "IT", "Female", 27, 95000.0, "Pune", 2021, true),
                new Employee(5L, "Vikas", "Admin", "Male", 36, 50000.0, "Delhi", 2017, false),
                new Employee(6L, "Neha", "Finance", "Female", 30, 110000.0, "Gurugram", 2019, true),
                new Employee(7L, "Rohit", "IT", "Male", 25, 70000.0, "Bangalore", 2022, true),
                new Employee(8L, "Anjali", "HR", "Female", 28, 110000.0, "Mumbai", 2020, false)
        );
        employees.stream().forEach(System.out::println);
        System.out.println("Employees in IT department with salary > 80000:");
        employees.stream().filter(e -> e.getDepartment().equals("IT") && e.getSalary() > 80000).forEach(System.out::println);
        System.out.println("Employees in Delhi who are active:");
        employees.stream().filter(e -> e.getCity().equals("Delhi") && e.getActive()).forEach(System.out::println);
        System.out.println("Employees grouped by department:");
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("Employees grouped by city:");
        employees.stream().collect(Collectors.groupingBy(Employee::getCity, Collectors.counting())).forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("Employees grouped by gender:");
        employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("Employees grouped by active status:");
        employees.stream().collect(Collectors.groupingBy(Employee::getActive, Collectors.counting())).forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("Employees sorted by salary in descending order:");
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
        System.out.println("Employees sorted by age in ascending order:");
        employees.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
        System.out.println("Employees sorted by name in ascending order:");
        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
        System.out.println("Employees sorted by department and then by salary in descending order:");
        employees.stream().sorted(Comparator.comparing(Employee::getDepartment).
                thenComparing(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);
        System.out.println("Employees sorted by year of joining in ascending order:");
        Optional<Double> secondHighestDistinctSalary = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        if (secondHighestDistinctSalary.isPresent()) {
            System.out.println("Second highest distinct salary: " + secondHighestDistinctSalary.get());
        } else {
            System.out.println("No second highest distinct salary found.");


        }
        List<Employee>   employeewithSecondHightestSalary =secondHighestDistinctSalary.stream().map(salary -> employees.stream().filter(e -> e.getSalary().equals(salary)).collect(Collectors.toList()))
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Employee(s) with second highest distinct salary:");
        employeewithSecondHightestSalary.forEach(System.out::println);

    }
}
