package com.hky.Call.by.Value.in.Different.Scenarios;
//Java Primitive Types:
//When a primitive type (e.g., int, double, boolean)
// is passed to a method, a copy of its value is made. Any changes to the parameter within the called method does not affect variable’s original value in calling method.
public class PrimitiveExample1 {
    public static void changeValue(int num) {
        num = 100;
        System.out.println("Inside method: " + num);
    }

    public static void main(String[] args) {
        int number = 50;

        changeValue(number);

        System.out.println("Outside method: " + number);
    }
}
//Explanation:The method modifyPrimitive(), receives a copy of value in `x`. Modifying `num` does not affect the original value of `x`.