package com.hky.immutable;

import java.util.*;
import java.util.stream.Collectors;

public final class Employee {
    private final String name;
    private final Date doj;
    private final List<String> mobile;
    private final  Address address;

    public Employee(String name, Date doj, List<String> mobile, Address address) {
        this.name = name;
        this.doj = doj;
        this.mobile = mobile;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Date getDoj() {
        return (Date) doj.clone();
    }

    public List<String> getMobile() {
        //return Collections.unmodifiableList(mobile);
        return  new ArrayList<>();
    }

    public Address getAddress() {
        return new Address(address.getZip(),address.getCity());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", doj=" + doj +
                ", mobile=" + mobile +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Address address=new Address("456","dgb");
        Employee employee = new Employee("hare", new Date(),
                Arrays.stream(new String[]{"9984079300", "8142647216"}).
                        collect(Collectors.toList()), address);
        System.out.println("Employee:"+employee);
        employee.getMobile().add("9523937816");
        employee.getDoj().setDate(15);
        employee.getAddress().setCity("pune");
        System.out.println("Employee:"+employee);
        //employee.name="krishna";
    }
}
