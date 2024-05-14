package cmo.hky.java8.practice;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestJava8 {

    public static void main(String[] args) {
        List<Employee> list = EmployeeList.getEmpList();
        list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getYearOfJoining))).ifPresent(e -> System.out.println("MaxBy:" + e.yearOfJoining));

        list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))).ifPresent(e -> System.out.println("MinBy:" + e.yearOfJoining));
        list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge))).ifPresent(e -> System.out.println("Maxgae:" + e.age));

        list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getAge))).ifPresent(e -> System.out.println("MinAge:" + e.age));
        list.stream().max(Comparator.comparing(Employee::getAge)).ifPresent(e -> System.out.println(e.age));

        list.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(e -> System.out.println(e.salary));
        list.stream().filter(checkBonus()).collect(Collectors.toList());
    }

    private static Predicate checkBonus() {

        Predicate<Employee> check = employee -> {
            Double sal = employee.getSalary();
            if (checkBonus().test(employee.getSalary() > 5000)) {
                sal = sal * 0.15;

            } else if (checkBonus().test(employee.getSalary() > 7500)) {
                sal = sal * 0.10;
            } else if (checkBonus().test(employee.getSalary() > 8000)) {
                sal = sal * 0.5;
            }else {
                sal = sal * 0.2;
            }


            return false;
        };
        return check;
    }
}





