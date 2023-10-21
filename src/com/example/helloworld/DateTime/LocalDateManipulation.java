package com.example.helloworld.DateTime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateManipulation {
    public static void main(String[] args) {
        LocalDate firstDay2021 = LocalDate.of(2021, Month.JANUARY, 1);
        LocalDate programmersDay = firstDay2021.plusDays(255);
        System.out.println("NextProgrammers Day = " + programmersDay);
    }
}
