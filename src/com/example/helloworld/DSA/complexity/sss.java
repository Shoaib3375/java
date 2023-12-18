package com.example.helloworld.DSA.complexity;
import java.util.Scanner;

public class sss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String t = scanner.next();

        // Initialize an empty string for the decrypted result
        StringBuilder s = new StringBuilder();

        // Start with the first character of t
        char currentChar = t.charAt(0);

        // Iterate through the characters of t
        for (int i = 1; i < n; ++i) {
            // Check if the current character is different from the previous one
            if (t.charAt(i) != currentChar) {
                // Calculate the number of times the current character was repeated
                // Append the character to the decrypted string
                s.append(String.valueOf(currentChar).repeat(i));
                // Update the current character to the new one
                currentChar = t.charAt(i);
            }
        }

        // Append the last character to the decrypted string
        s.append(String.valueOf(currentChar).repeat(n - s.length()));

        // Print the decrypted string
        System.out.println(s.toString());
    }
}
