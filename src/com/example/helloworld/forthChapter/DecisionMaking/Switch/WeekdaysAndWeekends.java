package com.example.helloworld.forthChapter.DecisionMaking.Switch;

import java.util.Scanner;

public class WeekdaysAndWeekends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day between (1 to 7)");
        int day = input.nextInt();

        // a part of Enhanced Switch statement :D
        String result = switch (day){
            case 1, 2, 3, 4, 5 -> "Weekdays";
            case 6, 7 -> "Weekends";
            default -> "Unexpected value: " + day;
        };
        System.out.println("Result = " + result);
    }
}
