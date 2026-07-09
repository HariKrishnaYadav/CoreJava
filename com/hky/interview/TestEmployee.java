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

        // ----------------------------------------------------------
        // Print All Employees
        // ----------------------------------------------------------
        System.out.println("========== All Employees ==========");
        employees.forEach(System.out::println);

        // ----------------------------------------------------------
        // Filter Employees
        // ----------------------------------------------------------

        System.out.println("\n========== IT Employees with Salary > 80,000 ==========");
        employees.stream()
                .filter(e -> e.getDepartment().equals("IT") && e.getSalary() > 80_000)
                .forEach(System.out::println);

        System.out.println("\n========== Active Employees in Delhi ==========");
        employees.stream()
                .filter(e -> e.getCity().equals("Delhi") && e.getActive())
                .forEach(System.out::println);

        // ----------------------------------------------------------
        // Grouping Operations
        // ----------------------------------------------------------

        System.out.println("\n========== Employees Grouped by Department ==========");
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .forEach((department, count) ->
                        System.out.println(department + " : " + count));

        System.out.println("\n========== Employees Grouped by City ==========");
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity, Collectors.counting()))
                .forEach((city, count) ->
                        System.out.println(city + " : " + count));

        System.out.println("\n========== Employees Grouped by Gender ==========");
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
                .forEach((gender, count) ->
                        System.out.println(gender + " : " + count));

        System.out.println("\n========== Employees Grouped by Active Status ==========");
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getActive, Collectors.counting()))
                .forEach((status, count) ->
                        System.out.println(status + " : " + count));

        // ----------------------------------------------------------
        // Sorting Operations
        // ----------------------------------------------------------

        System.out.println("\n========== Employees Sorted by Salary (Descending) ==========");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(System.out::println);

        System.out.println("\n========== Employees Sorted by Age (Ascending) ==========");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .forEach(System.out::println);

        System.out.println("\n========== Employees Sorted by Name ==========");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);

        System.out.println("\n========== Employees Sorted by Department and Salary ==========");
        employees.stream()
                .sorted(
                        Comparator.comparing(Employee::getDepartment)
                                .thenComparing(
                                        Comparator.comparing(Employee::getSalary).reversed()
                                )
                )
                .forEach(System.out::println);

        System.out.println("\n========== Employees Sorted by Joining Year ==========");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getYearOfJoining))
                .forEach(System.out::println);

        // ----------------------------------------------------------
        // Second Highest Distinct Salary
        // ----------------------------------------------------------

        Optional<Double> secondHighestDistinctSalary = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        secondHighestDistinctSalary.ifPresentOrElse(
                salary -> System.out.println(
                        "\nSecond Highest Distinct Salary : " + salary),
                () -> System.out.println(
                        "\nNo Second Highest Distinct Salary Found.")
        );

        // ----------------------------------------------------------
        // Employees Having Second Highest Salary
        // ----------------------------------------------------------

        List<Employee> employeesWithSecondHighestSalary =
                secondHighestDistinctSalary.stream()
                        .map(salary ->
                                employees.stream()
                                        .filter(employee -> employee.getSalary().equals(salary))
                                        .collect(Collectors.toList()))
                        .flatMap(List::stream)
                        .collect(Collectors.toList());

        System.out.println("\n========== Employee(s) with Second Highest Salary ==========");
        employeesWithSecondHighestSalary.forEach(System.out::println);

        System.out.println("\n========== Employee(s) with Second Highest Salary ==========");

        employees .stream().filter(e->e.getSalary()
                .equals(employees .stream().map(Employee::getSalary).distinct()
                        .sorted(Comparator.reverseOrder()).skip(1)
                        .findFirst().orElse(null))).forEach(System.out::println);
    }
}