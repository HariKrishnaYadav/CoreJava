package com.hky.interview;

public class BankAccount {

    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName()
                    + " is withdrawing " + amount);

            balance = balance - amount;

            System.out.println("Remaining Balance: " + balance);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(500), "ATM-1");
        Thread t2 = new Thread(() -> account.withdraw(700), "ATM-2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}