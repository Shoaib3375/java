package com.example.helloworld.DSA.complexity.hackerrank;

import java.util.*;

public class maps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        int n = scanner.nextInt();

        // Input the value x
        int x = scanner.nextInt();

        // Input the array elements
        List<Integer> v = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            v.add(scanner.nextInt());
        }

        // Count occurrences using a HashMap
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : v) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Output the count of x
        System.out.println(map.getOrDefault(x, 0));

        scanner.close();
    }
}
