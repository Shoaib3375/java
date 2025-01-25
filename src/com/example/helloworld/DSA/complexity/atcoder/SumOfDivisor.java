package com.example.helloworld.DSA.complexity.atcoder;


import java.util.Scanner;

public class SumOfDivisor {
    public static void main(String[] args) {
        int lim = 10000000;
        int[] arr = new int[lim + 1];


        for (int i = 1; i <= lim; i++) {
            for (int j = i; j <= lim; j += i) {
                arr[j]++;
            }
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;


        for (int i = 1; i <= n; i++) {
            ans += (long) i * arr[i];
        }

        System.out.println(ans);
    }
}
