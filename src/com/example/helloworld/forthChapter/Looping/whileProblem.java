package com.example.helloworld.forthChapter.Looping;

public class whileProblem {
    public static void main(String[] args) {
        int START = 0;
        int END = 500;
        int PER_LINE = 10;

        int counter = START;

        while (counter <= END){
            System.out.println(counter + " ");
            if ((counter + 1) % PER_LINE == 0){
                System.out.println();
            }
            counter++;
        }
    }
}
