package com.hky.basic.program;

public class AddTwoNumbers {
    int add(int a, int b) {
        return a + b;
    }

    static void main(String[] args) {
        AddTwoNumbers obj = new AddTwoNumbers();
        int sum = obj.add(5, 10);
        System.out.println("Sum: " + sum);
    }
}
