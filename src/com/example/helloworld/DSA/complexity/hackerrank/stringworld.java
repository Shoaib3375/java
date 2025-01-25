package com.example.helloworld.DSA.complexity.hackerrank;

import java.util.*;
import java.util.regex.*;

public class stringworld {

    public static void recoverPasswords(List<String> testCases) {
        // Regex pattern to match any substring with exactly two digits
        Pattern pattern = Pattern.compile("\\w*\\d{2}\\w*");

        for (String s : testCases) {
            Matcher matcher = pattern.matcher(s);
            List<String> passwords = new ArrayList<>();

            // Find all matches of the pattern
            while (matcher.find()) {
                passwords.add(matcher.group()); // Add the found password to the list
            }

            // Print the passwords separated by spaces
            System.out.println(String.join(" ", passwords));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Read number of test cases
        scanner.nextLine(); // Consume the newline

        List<String> testCases = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            testCases.add(scanner.nextLine()); // Read each test case
        }

        recoverPasswords(testCases); // Process and recover passwords
        scanner.close();
    }
}
