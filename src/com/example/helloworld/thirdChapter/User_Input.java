package com.example.helloworld.thirdChapter;
import java.util.Scanner;
public class User_Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        System.out.println("Enter another Number: ");
        int b = input.nextInt();

        int sum = a + b;
        System.out.println("Sum : " + sum);
    }
}
