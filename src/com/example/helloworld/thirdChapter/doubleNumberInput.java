package com.example.helloworld.thirdChapter;


import java.util.Scanner;

public class doubleNumberInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the radius of a circle: ");

        double radius = input.nextDouble();

        double area = radius * radius * 3.1416;
        System.out.println("Area: " +area);
    }
}
