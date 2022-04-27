package com.example.helloworld.thirdChapter.typeCasting;

public class NarrowingPrimitiveConversion {
    public static void main(String[] args) {
        /*
        * This => list shorted by Big Data Type to small data type
        * short -> byte, char
        * char -> byte, short
        * int -> byte, short, char
        * long -> byte, short, char, int
        * float -> byte, short, char, int, long
        * double -> byte, short , char, int, long, float
        When data type convert Big to small then we call it NarrowingPrimitiveConversion-
        */
        double aDouble = 97.04;
        long aLong = (long) aDouble; // Explicit type casting
        int aInt = (int) aLong; // Explicit type casting
        System.out.println("Double value " + aDouble);
        System.out.println("Long value " + aLong);
        System.out.println("Int value " + aInt);
    }
}
