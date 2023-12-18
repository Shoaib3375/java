package com.example.helloworld.DSA.complexity;

import java.util.Scanner;

public class cfe {

    static Pair<Integer, Integer> findLowestNumberAndPosition(int N, int[] A) {
        int minNumber = Integer.MAX_VALUE;
        int position = -1;

        for (int i = 0; i < N; ++i) {
            if (A[i] < minNumber) {
                minNumber = A[i];
                position = i + 1;
            }
        }

        return new Pair<>(minNumber, position);
    }

    public static void main(String[] args) {
        // Input reading
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; ++i) {
            A[i] = scanner.nextInt();
        }

        // Find and print the lowest number and its position
        Pair<Integer, Integer> result = findLowestNumberAndPosition(N, A);
        System.out.println(result.getKey() + " " + result.getValue());
    }

    // Pair class for storing two values
    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
