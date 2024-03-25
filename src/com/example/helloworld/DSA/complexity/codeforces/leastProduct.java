package com.example.helloworld.DSA.complexity.codeforces;

import java.util.Scanner;

import java.util.HashSet;
import java.util.Set;

public class leastProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            String s = scanner.next();

            // Use a set to store unique substrings
            Set<String> uniqueSubstrings = new HashSet<>();

            // Generate substrings by removing the first character
            for (int i = 0; i < n; i++) {
                uniqueSubstrings.add(s.substring(i));
            }

            // Generate substrings by removing the second character
            for (int i = 0; i < n - 1; i++) {
                uniqueSubstrings.add(s.substring(0, i) + s.substring(i + 1));
            }

            System.out.println(uniqueSubstrings.size());
        }
    }
}
