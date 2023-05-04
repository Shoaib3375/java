package com.example.helloworld.fiveChapter;

import java.util.Scanner;

public class sumInputArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of array: ");
        int sizeOfArray = input.nextInt();

        int[] numbers = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++){
            System.out.print(i + ": ");
            numbers[i] = input.nextInt();
        }
        System.out.println("Index\tValue");
        for (int i = 0; i < numbers.length; i++){
            System.out.println(i + "\t" + numbers[i]);
        }
    }
}
