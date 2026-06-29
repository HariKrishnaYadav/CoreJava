package com.hky.Call.by.Value.in.Different.Scenarios;
//Java Primitive Types:
//When a primitive type (e.g., int, double, boolean)
// is passed to a method, a copy of its value is made. Any changes to the parameter within the called method does not affect variable’s original value in calling method.
public class PrimitiveExample {
    public static void modifyPrimitive(int num) {
        num = 42; // Changes local copy
    }
    public static void main(String[] args) {
        int x = 10;
        modifyPrimitive(x);
        System.out.println(x); // Output: 10
    }
}
//Explanation:The method modifyPrimitive(), receives a copy of value in `x`. Modifying `num` does not affect the original value of `x`.