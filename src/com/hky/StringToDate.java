package com.hky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

public class StringToDate {
    public static void main(String[] args) throws ParseException {
        String dateStr = "2024-04-15";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // Parsing the String to Date
            Date date = formatter.parse(dateStr.formatted());
            System.out.println("Converted Date: " + date);

            // Formatting the Date back to String
            String formattedDate = formatter.format(date);
            System.out.println("Formatted Date: " + formattedDate);
        } catch (ParseException e) {
            System.out.println("Invalid date format: " + e.getMessage());
        }
    }

}
