package com.example.helloworld.StringMathApiUtilityClass;

import java.time.LocalDate;

public class testStr {
    public static void main(String[] args) {
        LocalDate lcoalDate = LocalDate.now();
        String dateString = lcoalDate.toString();
        System.out.println("Today is " + dateString);
        // In primitive data type, toString() method not support.
        // If, want convert to string, we need valueOf method.
        String one = String.valueOf(1);
        System.out.println(one);
    }
}
