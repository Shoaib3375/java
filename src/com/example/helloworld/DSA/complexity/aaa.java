package com.example.helloworld.DSA.complexity;

import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String s = scanner.next();

            String result = MakeZero(s) ? "YES" : "NO";
            System.out.println(result);
        }

        scanner.close();
    }

    private static boolean MakeZero(String s) {
        int countZeros = 0;
        int countOnes = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') {
                countZeros++;
            } else {
                countOnes++;
            }
        }

        if (countZeros > countOnes) {
            return true;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                return true;
            }
        }

        return false;
    }
}
