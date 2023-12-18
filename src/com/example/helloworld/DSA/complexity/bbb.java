package com.example.helloworld.DSA.complexity;

import java.util.Scanner;

public class bbb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tc = scanner.nextInt();
        int[][] testCases = new int[tc][4];

        for (int i = 0; i < tc; i++) {
            for (int j = 0; j < 4; j++) {
                testCases[i][j] = scanner.nextInt();
            }
        }

        int[] results = maxRestDays(tc, testCases);

        for (int result : results) {
            System.out.println(result);
        }
    }

    static int[] maxRestDays(int tc, int[][] testCases) {
        int[] results = new int[tc];

        for (int i = 0; i < tc; i++) {
            int n = testCases[i][0];
            int P = testCases[i][1];
            int l = testCases[i][2];
            int t = testCases[i][3];

            int maxRest = 0;
            int currentPoints = 0;

            for (int day = 1; day <= n; day++) {
                currentPoints += l; // Points for attending a lesson

                // Calculate the points for completing practical tasks
                int taskDay = (day - 1) / 7 * 7 + 1;
                int taskCount = Math.min(2, (n - taskDay) / 7 + 1);
                int taskPoints = t * taskCount;

                currentPoints += taskPoints;

                // Update maximum rest days if current points are greater than or equal to P
                if (currentPoints >= P) {
                    maxRest = Math.max(maxRest, n - day);
                }
            }

            results[i] = maxRest;
        }

        return results;
    }
}
