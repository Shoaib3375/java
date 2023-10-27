package com.example.helloworld.StringMathApiUtilityClass;

import com.sun.jdi.ClassObjectReference;

public class StringMethod {
    public static void main(String[] args) {
        String text = "Lorem ipsu dolor sit amet.";
        int len = text.length();
        String h = "Hello";
        char getCharOfIndex2 = h.charAt(4);
        System.out.println(getCharOfIndex2);
    }
}
