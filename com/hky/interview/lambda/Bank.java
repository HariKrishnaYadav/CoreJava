package com.hky.interview.lambda;

public interface Bank {
    void withdraw(int amount);

    default void deposit(int amount) {
        System.out.println("bank deposit method");
        System.out.println("Depositing " + amount + " dollars"+"  bank deposit method");
    }
}
