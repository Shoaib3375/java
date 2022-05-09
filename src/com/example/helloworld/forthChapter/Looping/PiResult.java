package com.example.helloworld.forthChapter.Looping;

public class PiResult {
    public static void main(String[] args) {
        getPiValue piCalculator = new getPiValue(); // Link getPiValue
        var pi = piCalculator.calculate(100_000);
        System.out.println("pi = " + pi);
    }
}
