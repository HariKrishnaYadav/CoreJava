package com.hky.oops.test3;

import java.util.HashSet;
//equals() overridden
//
//hashCode() NOT overridden
//
//HashSet uses hashCode first
//
//Different hash codes → different buckets
//
//📌 Rule:
//
//If equals() is overridden, hashCode() must be overridden.
class Employee {
    int id;

    Employee(int id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        Employee e = (Employee) o;
        return this.id == e.id;
    }
}

public class Test {
    public static void main(String[] args) {
        HashSet<Employee> set = new HashSet<>();
        set.add(new Employee(1));
        set.add(new Employee(1));

        System.out.println(set.size());
    }
}
