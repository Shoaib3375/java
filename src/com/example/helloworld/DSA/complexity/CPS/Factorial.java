package com.example.helloworld.DSA.complexity.CPS;

import java.util.Scanner;

public class Factorial {
    static final int MOD = 1000000007;
    static long[] dp = new long[100123];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(fact(n));
        }

        sc.close();
    }

    static long fact(long n) {
        if (n == 0) return 1;
        if (dp[(int) n] != 0) return dp[(int) n];

        long res = (n * fact(n - 1)) % MOD;
        dp[(int) n] = res;
        return dp[(int) n];
    }
}
