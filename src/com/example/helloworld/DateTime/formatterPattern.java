package com.example.helloworld.DateTime;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class formatterPattern {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        String text = date.format(formatter);
        System.out.println("text = " + text);
    }
}
