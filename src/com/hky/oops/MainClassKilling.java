package com.hky.oops;

public class MainClassKilling {
    double overloadedMethod(double d)
    {
        return d *= d;
    }

    int overloadedMethod(int i)
    {
        return overloadedMethod(i *= i);
    }

    float overloadedMethod(float f)
    {
        return overloadedMethod(f *= f);
    }

    public static void main(String[] args)
    {
        MainClassKilling main = new MainClassKilling();

        System.out.println(main.overloadedMethod(100));
    }
}
