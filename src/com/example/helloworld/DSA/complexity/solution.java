package com.example.helloworld.DSA.complexity;

import java.util.Scanner;

public class solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String id = scanner.next();
            String username = "";

            for (int j = 0; j < id.length(); j++) {
                char c = id.charAt(j);
                if (Character.isLetter(c)) {
                    username += c;
                } else {
                    break;
                }
            }

            System.out.println(username);
        }
    }
}