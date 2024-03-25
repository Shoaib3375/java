package com.example.helloworld.DSA.complexity.codeforces;

import java.io.*;
import java.util.Scanner;

public class xxsss {
    // Complete the maximumDraws function below.
    static int maximumDraws(int n) {
        // follows pigeonhole principle of math
        return n + 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.nextLine();

            int result = maximumDraws(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        scanner.close();
    }
}
