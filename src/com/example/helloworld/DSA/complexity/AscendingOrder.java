package com.example.helloworld.DSA.complexity;

import java.util.Scanner;
public class AscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t!=0){
        int N = scanner.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        boolean isAscending = true;
        for (int i = 1; i < N ; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isAscending = false;
                break;
            }
        }

        if (isAscending) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        }
    }
}
