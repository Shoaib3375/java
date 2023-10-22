package com.example.helloworld.DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatStyleDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime timenow = LocalTime.now();
        String fullDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("fullDate = " + fullDate);
        String longDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("LongDate = " + longDate);
        String mediumDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("MediumDate = " + mediumDate);
        String shortDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        String shortDateNow = timenow.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
        System.out.println("Using LocalizedTime() method ofDateTimeFormatter class " + shortDateNow);
        System.out.println("ShortDate = " + shortDate);


    }
}
