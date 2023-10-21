package com.example.helloworld.DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class Scheduler {
    public static List<LocalDate> getSchedules(
            LocalDate startOfTheYear,
            LocalDate endOfTheYear,
            DayOfWeek dayOfWeek){
        List<LocalDate> dates = new ArrayList<>();
        LocalDate date = startOfTheYear.with(
                TemporalAdjusters.nextOrSame(dayOfWeek)
        );
        do {
            dates.add(date);
            date = date.plusWeeks(1);
        }while (date.isBefore(endOfTheYear));
        return dates;
    }
}