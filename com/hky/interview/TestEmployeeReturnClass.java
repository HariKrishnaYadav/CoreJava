package com.hky.interview;

import java.util.Arrays;
import java.util.List;

public class TestEmployeeReturnClass {

  public  static  List<Employee>  getEmployeesList() {
        return Arrays.asList(
                new Employee(1L, "Rahul", "IT", "Male", 29, 85000.0, "Gurugram", 2020, true),
                new Employee(2L, "Priya", "HR", "Female", 32, 65000.0, "Delhi", 2018, true),
                new Employee(3L, "Amit", "Finance", "Male", 41, 120000.0, "Mumbai", 2015, true),
                new Employee(4L, "Sneha", "IT", "Female", 27, 95000.0, "Pune", 2021, true),
                new Employee(5L, "Vikas", "Admin", "Male", 36, 50000.0, "Delhi", 2017, false),
                new Employee(6L, "Neha", "Finance", "Female", 30, 110000.0, "Gurugram", 2019, true),
                new Employee(7L, "Rohit", "IT", "Male", 25, 70000.0, "Bangalore", 2022, true),
                new Employee(8L, "Anjali", "HR", "Female", 28, 110000.0, "Mumbai", 2020, false),
                new Employee(8L, "Hare", "HR", "Male", 28, 110000.0, "Mumbai", 2020, false)
        );
    }

}
