package com.example.helloworld.DSA.complexity.codeforces.div4;

import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String word = scanner.next();

            StringBuilder result = new StringBuilder();
            int i = 0;

            while (i < n) {
                char currentChar = word.charAt(i);

                // Include the current vowel
                if (isVowel(currentChar)) {
                    result.append(currentChar);
                    i++;

                    // Include consecutive consonants after the vowel
                    while (i < n && !isVowel(word.charAt(i))) {
                        result.append(word.charAt(i));
                        i++;
                    }
                } else {
                    // Include consecutive consonants
                    while (i < n && !isVowel(word.charAt(i))) {
                        result.append(word.charAt(i));
                        i++;
                    }
                }

                // Insert a dot between syllables
                if (i < n) {
                    result.append('.');
                }
            }

            System.out.println(result);
        }

        scanner.close();
    }

    // Helper function to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e';
    }
}
