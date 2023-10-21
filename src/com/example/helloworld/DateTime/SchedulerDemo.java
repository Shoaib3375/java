package com.example.helloworld.DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class SchedulerDemo {
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        LocalDate start = LocalDate.of(2021, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2021, Month.FEBRUARY, 28);
        List<LocalDate> schedules = scheduler.getSchedules(
                start, end, DayOfWeek.MONDAY
        );
        System.out.println(schedules);
    }
}
