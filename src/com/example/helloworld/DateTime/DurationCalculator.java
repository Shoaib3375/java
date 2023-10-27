package com.example.helloworld.DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DurationCalculator {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Enter start date(MM/dd/yyyy): ");
            String first = in.nextLine();
            LocalDate startDate = LocalDate.parse(first, formatter);

            System.out.println("Enter end date(MM/dd/yyyy): ");
            String second = in.nextLine();
            LocalDate endDate = LocalDate.parse(second, formatter);

            Period period = Period.between(startDate, endDate);
            System.out.println("It is " + period.getYears() + "Years, "
                                + period.getMonths() + " months and " +
                    period.getDays() + " days.");
        }catch (DateTimeParseException e){
            e.printStackTrace();
            System.out.println("Invalid Date, " + "Please use proper format");
        }
    }
}
