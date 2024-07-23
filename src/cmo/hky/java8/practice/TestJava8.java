package cmo.hky.java8.practice;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class TestJava8 {

    public static void main(String[] args) {
        List<Employee> list = EmployeeList.getEmpList();
        list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getYearOfJoining))).ifPresent(e -> System.out.println("MaxBy:" + e.yearOfJoining));

        list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))).ifPresent(e -> System.out.println("MinBy:" + e.yearOfJoining));
        list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge))).ifPresent(e -> System.out.println("Maxgae:" + e.age));

        list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getAge))).ifPresent(e -> System.out.println("MinAge:" + e.age));

        Map<String, List<Employee>> map = list.stream().collect(Collectors.groupingBy(employee -> employee.getSalary() > 5000 ? "bonus" : "not get bonus"));
       // System.out.println("map::"+map.);
        // Map<String, Integer> map = new HashMap<>();
//        list.stream().max(Comparator.comparing(Employee::getAge)).stream().toList().forEach(e->{
//            map.put(e.getName(),e.getAge());
//        });
        System.out.println("if two employee having same name");
        Optional<Double> maxSalary = list.stream()
                .map(Employee::getSalary)
                .max(Double::compareTo);
        if (maxSalary.isPresent()) {
            List<Employee> maxSalaryEmployees = list.stream()
                    .filter(employee -> employee.getSalary() == maxSalary.get())
                    .collect(Collectors.toList());

            System.out.println("Employees with the maximum salary:");
            maxSalaryEmployees.forEach(System.out::println);


            
            };
        System.out.println("=============================================");
        list.stream()
                .filter(employee -> {
                    if (employee.getSalary() > 5000) {
                        employee.setSalary(employee.getSalary() * 1.20);
                    }
                    return true;
                })
                .filter(employee -> {
                    System.out.println("without bonus::"+employee.getSalary());
                    if (employee.getSalary() > 1000 && employee.getSalary() <= 5000) {
                        employee.setSalary(employee.getSalary() * 1.15);
                        System.out.println("Bonus:"+employee.getSalary());
                    }

                    return true;
                })
                .filter(employee -> {
                    if (employee.getSalary() > 500 && employee.getSalary() <= 1000) {
                        employee.setSalary(employee.getSalary() * 1.10);
                    }
                    return true;
                })
                .forEach(System.out::println);
        System.out.println("=============================================");
//        //for(Map.Entry<String,Integer> m:map.entrySet()){
//
//            System.out.println("name:"+m.getKey()+" "+m.getValue());
//        }
            Optional<Integer> maxAge = list.stream().map(Employee::getAge).max(Integer::compareTo);
            if(maxAge.isPresent()){
                list.stream().filter(e->e.getAge()==maxAge.get()).forEach(e-> System.out.println("name::"+e.getName()+":::"+e.getAge()));
            }

            list.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(e -> System.out.println(e.getAge()));
           // list.stream().filter(checkBonus()).collect(Collectors.toList());
        }

//    private static Predicate checkBonus() {
//
//        Predicate<Employee> check = employee -> {
//            Double sal = employee.getSalary();
//            if (checkBonus().test(employee.getSalary() > 5000)) {
//                sal = sal * 0.15;
//
//            } else if (checkBonus().test(employee.getSalary() > 7500)) {
//                sal = sal * 0.10;
//            } else if (checkBonus().test(employee.getSalary() > 8000)) {
//                sal = sal * 0.5;
//            }else {
//                sal = sal * 0.2;
//            }
//
//
//            return false;
//        }return check;
//    }
    }





