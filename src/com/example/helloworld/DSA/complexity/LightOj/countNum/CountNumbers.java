package com.example.helloworld.DSA.complexity.LightOj.countNum;

import java.util.Scanner;

public class CountNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        scanner.nextLine(); // consume the newLine

        for (int i = 0; i < T; i++) {
            String line = scanner.nextLine();

            int result = countNumbers(line);
            System.out.println(result);
        }

        scanner.close();
    }

    private static int countNumbers(String line) {
        String[] numbers = line.split("\\s+");
        return numbers.length;
    }
}
