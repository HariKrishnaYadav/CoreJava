package com.hky.Calendars;

import java.util.Calendar;

public class Calendar1 {
    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        String result = "";
        switch (dayOfWeek) {
            case 2:
                result = "MONDAY";
                break;
            case 3:
                result = "TUESDAY";
                break;
            case 4:
                result = "WEDNESDAY";
                break;
            case 5:
                result = "THURSDAY";
                break;
            case 6:
                result = "FRIDAY";
                break;
            case 7:
                result = "SATURDAY";
                break;
            case 1:
                result = "SUNDAY";
                break;
        }

        return result;
    }
    public static void main(String args[]) {
        Calendar c = Calendar.getInstance();
        System.out.println("The Current Date is:" + c.getTime());
        // Demonstrate Calendar's get()method
        System.out.println("Current Calendar's Year: " + c.get(Calendar.YEAR));
        System.out.println("Current Calendar's Day: " + c.get(Calendar.DATE));
        System.out.println("Current MINUTE: " + c.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + c.get(Calendar.SECOND));

        int max = c.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum number of days in a week: " + max);

        max = c.getMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("Maximum number of weeks in a year: " + max);


        int min = c.getMinimum(Calendar.DAY_OF_WEEK);
        System.out.println("Minimum number of days in week: " + min);

        min = c.getMinimum(Calendar.WEEK_OF_YEAR);
        System.out.println("Minimum number of weeks in year: " + min);


        c.add(Calendar.DATE, -15);
        System.out.println("15 days ago: " + c.getTime());
        c.add(Calendar.MONTH, 4);
        System.out.println("4 months later: " + c.getTime());
        c.add(Calendar.YEAR, 2);
        System.out.println("2 years later: " + c.getTime());
        System.out.println(findDay(8, 5, 2996));
    }
}
