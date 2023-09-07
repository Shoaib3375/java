package com.example.helloworld.DateTime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
//        LocalDate today = LocalDate.now();
        LocalDate today = LocalDate.of(2021, Month.MAY, 1);
        LocalDate withDays15 = today.withDayOfMonth(15);
        LocalDate birth = LocalDate.of(2002, Month.NOVEMBER, 24);
        System.out.println("Today = " + today);
        System.out.println("With Day 15 = " + withDays15 );
        System.out.println("Birth = " + birth);
    }
}
