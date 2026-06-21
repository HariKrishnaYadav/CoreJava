package com.hky.interview.lambda;

public class Lambda implements Bank {
    @Override
    public void withdraw(int amount) {
        System.out.println("lambda withdraw method");
        System.out.println("Withdrawing " + amount + " dollars");
    }
   public void deposit(int amount) {
        System.out.println("lambda bank deposit method");
        System.out.println("Depositing " + amount + " dollars"+"  bank deposit method");
    }

    public static void main(String[] args) {
        Bank bank= amount -> System.out.println("Withdrawing " + amount + " dollars");
        bank.withdraw(500);
        System.out.println("-----------------------------");
        Lambda lambda = new Lambda();
        lambda.withdraw(300);
        lambda.deposit(200);
        Bank b=new Lambda();
        b.deposit(100);
       Bank b1 =new Bank() {
           @Override
           public void withdraw(int amount) {
                System.out.println("Anonymous class withdraw method");
                System.out.println("Withdrawing " + amount + " dollars");
           }
       };
    }
}
