package com.example.helloworld.DSA.complexity;

import java.util.Scanner;

public class numberSeparate {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            int sum = 0;
            int product = 1;

            while (number > 0) {
                sum += number % 10;
                product *= number % 10;
                number /= 10;
            }
            System.out.println(sum + " " + product);
        }


}
