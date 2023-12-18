package com.example.helloworld.DSA.complexity;

import java.util.Scanner;

public class cfe2 {
    static int[] findLowestNumberAndPosition(int N, int[] A) {
        int[] result = new int[2];
        int minNumber = Integer.MAX_VALUE;
        int position = -1;

        for (int i = 0; i < N; ++i) {
            if (A[i] < minNumber) {
                minNumber = A[i];
                position = i + 1;
            }
        }
        result[0] = minNumber;
        result[1] = position;
        return result;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; ++i) {
            A[i] = scanner.nextInt();
        }


        int[] result = findLowestNumberAndPosition(N, A);
        System.out.println(result[0]  + result[1]);
    }
}
