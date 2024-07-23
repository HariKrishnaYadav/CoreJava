package com.hky.exception;

public class ReThrowing {
    public static void main(String[] args) {
        try
        {
            String s = null;
            System.out.println(s.length());   //This statement throws NullPointerException
        }
        catch(NullPointerException ex)
        {
            System.out.println("NullPointerException is caught here");

            throw ex;     //Re-throwing NullPointerException
        }
    }
}
