package com.hky.arrays;

import cmo.hky.java8.practice.Employee;

public class ArraysOfObjects {
    public static void main(String[] args) {
        Employee employee[]=new Employee[4];
        employee[0]=new Employee(3,"kumar",34,"M","phy",20,50000);
        employee[1]=new Employee(5,"anoj",34,"M","phy",20,50000);

        employee[2]=new Employee(8,"Deo",34,"M","phy",20,50000);
        employee[3]=new Employee(5,"Kunal",34,"M","phy",20,50000);
     for(int i=0;i<employee.length;i++){
         System.out.println("Employeelist::"+employee[i].getId()+"===="+employee[i].getName());
     }
    }
}
