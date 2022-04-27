package com.example.helloworld.thirdChapter.typeCasting;

public class WideningPrimitiveConversion {
    /*
    This => list by small data type to Big data type.
    * byte -> short , int , long , float, double
    * short -> int , long , float, double
    * char -> int , long , float, double
    * int -> long, float, double,
    * long -> float, double
    * float -> double*/
    // When data type convert Small to big then we call it windeingPrimitiveConversion-
    public static void main(String[] args) {
        int anInt = 100;
        long aLong  = anInt; // no explicit casting
        float aFloat = aLong; // no explicit casting

        System.out.println("Int value " + anInt);
        System.out.println("Long value" + aLong);
        System.out.println("Float value " + aFloat);

    }
}
