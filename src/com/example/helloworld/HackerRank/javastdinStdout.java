package com.example.helloworld.HackerRank;

import java.util.Scanner;

public class javastdinStdout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myInt = scanner.nextInt();
        int se = scanner.nextInt();
        int th = scanner.nextInt();
        scanner.close();
        System.out.println( myInt );
        System.out.println( se );
        System.out.println( th );


    }
}
