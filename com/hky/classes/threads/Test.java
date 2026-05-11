package com.hky.classes.threads;

class BankAccount {

    int balance = 1000;

    public void withdraw(int amount) {

        if(balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " withdrawing money");

            balance = balance - amount;

            System.out.println("Remaining Balance: " + balance);
        }
    }
}

public class Test {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Runnable task = () -> {
            account.withdraw(700);
        };

        Thread t1 = new Thread(task, "User1");
        Thread t2 = new Thread(task, "User2");

        t1.start();
        t2.start();
    }
}