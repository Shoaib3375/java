package com.example.helloworld.DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatting_parsing {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        String formattedString = now.toString();
        System.out.println("formattedString = " + formattedString);
//        LocalDateTime parsedDate = LocalDateTime.parse("2021-01-29T23::55:16.089056");
//        System.out.println("parseDate = " + parsedDate);
        String isoDate = now.format(DateTimeFormatter.ISO_DATE);
        System.out.println(isoDate);
    }
}
