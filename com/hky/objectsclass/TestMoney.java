package com.hky.objectsclass;

import java.util.HashSet;

public class TestMoney {
    public static void main(String[] args) {
        Money income = new Money(55, "USD");
        Money expenses = new Money(55, "USD");
        boolean balanced = income.equals(expenses);
        System.out.println(income.hashCode()+"::"+expenses.hashCode());
        System.out.println(balanced);
        HashSet<Money> set=new HashSet<>();
        set.add(income);
        set.add(expenses);
        System.out.println(set.size());
    }
}
