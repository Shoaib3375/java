package com.example.helloworld.DSA.complexity;

import java.util.Scanner;

public class RatingIncrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            Pair result = ab(s);

            if (result.a == -1) {
                System.out.println(-1);
            } else {
                System.out.println(result.a + " " + result.b);
            }
        }
    }

    static class Pair {
        int a, b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    private static Pair ab(String s) {
        for (int i = 1; i < s.length(); ++i) {
            String aStr = s.substring(0, i);
            String bStr = s.substring(i);

            int a = Integer.parseInt(aStr);
            int b = Integer.parseInt(bStr);

            if (a > 0 && b > 0 && b > a && aStr.charAt(0) != '0' && bStr.charAt(0) != '0') {
                return new Pair(a, b);
            }
        }

        return new Pair(-1, -1);
    }
}
