package com.example.helloworld.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;

public class DateTimeFormatterBuilderExample {
    public static void main(String[] args) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatter formatter = dateTimeFormatterBuilder.appendValue(ChronoField.YEAR, 4)
                .appendLiteral(" ")
                .appendText(ChronoField.MONTH_OF_YEAR, TextStyle.FULL)
                .appendLiteral(" ")
                .appendValue(ChronoField.DAY_OF_MONTH, 2)
                .toFormatter();
        String date = "2022 January 30";
        LocalDate parsedDate = LocalDate.parse(date, formatter);
        System.out.println("parsedDate = " + parsedDate);
    }
}
