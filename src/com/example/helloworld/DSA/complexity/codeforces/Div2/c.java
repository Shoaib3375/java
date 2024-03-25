package com.example.helloworld.DSA.complexity.codeforces.Div2;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {
            int n = scanner.nextInt();
            int[] cities = new int[n];
            for (int i = 0; i < n; i++) {
                cities[i] = scanner.nextInt();
            }

            int[] closestCity = new int[n + 1];
            closestCity[0] = 0;

            // Precompute  city for each city
            for (int i = 1; i <= n; i++) {
                closestCity[i] = closestCity[i - 1];
                while (closestCity[i] < n && Math.abs(cities[closestCity[i] + 1] - cities[i - 1]) <= Math.abs(cities[closestCity[i]] - cities[i - 1])) {
                    closestCity[i]++;
                }
            }

            int m = scanner.nextInt();
            for (int query = 0; query < m; query++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                if (closestCity[y] < x) {
                    int temp = x;
                    x = y;
                    y = temp;
                }

                int cost = Math.abs(cities[y - 1] - cities[x - 1]);
                cost = Math.min(cost, Math.abs(cities[closestCity[y]] - cities[x - 1]) +
                        Math.min(Math.abs(cities[y - 1] - cities[closestCity[y]]), Math.abs(cities[closestCity[y]] - cities[x - 1])));

                System.out.println(cost);
            }
        }
        scanner.close();
    }
}
