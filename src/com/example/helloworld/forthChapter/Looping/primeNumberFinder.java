package com.example.helloworld.forthChapter.Looping;

import java.util.Scanner;

public class primeNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = input.nextLong();

        System.out.println("Prime factor of " + n + " are: ");

        // no factors would exist beyond
        // (n/i) for a particular factor
        for(long i = 2; i< n/ i; i++){
            while (n % i == 0){
                // If i is a factor
                System.out.println(i + " ");
                // divide n by i, else we won't get a prime number
                n = n/ i;
            }
        }
        if (n > 1){
            System.out.println(n);
        }
    }
}
