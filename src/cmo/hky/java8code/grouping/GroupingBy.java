package cmo.hky.java8code.grouping;

import cmo.hky.java8code.Employee;
import cmo.hky.java8code.EmployeeList;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        List<Employee> list = EmployeeList.getEmpList();
        list.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach((k, v) -> {
            System.out.println("Department: " + k);
            v.forEach(e -> System.out.println(e.getName()));
        });
        System.out.println("------------------How to count elements in each group?-----------------");
        Map<String, Long> countMap =
                list.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.counting()
                        ));
        System.out.println("Count of employees in each department: " + countMap);
        System.out.println("------------------How to find the maximum salary in each department?-----------------");
        Map<String, Double> maxSalaryMap =
                list.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())),
                                        maxEmployee -> maxEmployee.map(Employee::getSalary).orElse(0.0)
                                )
                        ));
        System.out.println("Maximum salary in each department: " + maxSalaryMap);
        System.out.println("------------------How to get sum of salary per department?-----------------");
        Map<String, Double> salarySum =
                list.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.summingDouble(Employee::getSalary)
                        ));
        System.out.println("Sum of salary per department: " + salarySum);
        System.out.println("------------------How to find max salary employee per department?-----------------");
        Map<String,
                Optional<Employee>> maxSalary =
                list
                        .stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                        ));
        System.out.println("Max salary employee per department: " + maxSalary);
        Map<String, Map<String, List<Employee>>> result =
                list.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.groupingBy(Employee::getGender)
                        ));
        System.out.println("result"+result);

        Map<String, Double> avgSalary =
                list.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));
        System.out.println("Average salary per department: " + avgSalary);
        Map<Boolean, List<Employee>> map =
                list.stream()
                        .collect(Collectors.partitioningBy(e -> e.getSalary() > 50000));

        System.out.println("How to flatten Optional values after grouping?");
        Map<String, Employee> flatten=
                list.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                                        Optional::get
                                )
                        ));
        System.out.println("flatten::"+flatten);
        System.out.println("How to group and sort values?");
        Map<String, List<Employee>> sortedMap =
                list.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        lists -> lists.stream()
                                                .sorted(Comparator.comparing(Employee::getSalary))
                                                .toList()
                                )
                        ));
    }

}
