package com.hky.exception;

public class ReturnValueFromTryCatchFinally4 {


    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }

    static int methodReturningValue()
    {
        int i = 0;

        try
        {
            i = 1;
            return i;
        }
        catch (Exception e)
        {
            i = 2;
            return i;
        }
        finally
        {
            i = 3;
        }
    }
}
