package com.hky;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class times {
    public static void main(String[] args) throws ParseException {
        String st="2024-04-15";
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(format.parse(st));
    }

}
