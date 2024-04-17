package com.hky.maps;

import cmo.hky.java8.practice.Employee;

import java.util.HashMap;

public class MapTestEqual {
    public static void main(String[] args) {
        Employee e1=new Employee(4,"hare",43,"M","c",3203,5555);
        Employee e2=new Employee(4,"hare",43,"M","c",3203,5555);
        HashMap<Employee,Integer> map=new HashMap<>();
        map.put(e1,34);
        map.put(e2,32);
        System.out.println("size::"+map.size());
        System.out.println("equal::"+e1.equals(e2));
    }
}
