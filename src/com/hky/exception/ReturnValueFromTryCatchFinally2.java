package com.hky.exception;

public class ReturnValueFromTryCatchFinally2 {
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());    //Output : 10
    }

    static int methodReturningValue()
    {
        try
        {
            return 10;    //control will not be passed to main() method here
        }
        catch (Exception e)
        {
            return 20;    //Control will not be passed to main() method here
        }
        finally
        {
            System.out.println("finally block is always executed");

            //Control will be passed to main() method after executing this block
        }
    }
}
