package com.hky.exception;

public class ReturnValueFromTryCatchFinally5 {

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
        }
        finally
        {
            i = 3;
        }

        return i;
    }
}
