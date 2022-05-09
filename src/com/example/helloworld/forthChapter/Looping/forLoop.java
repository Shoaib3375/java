package com.example.helloworld.forthChapter.Looping;

public class forLoop {
    public static void main(String[] args) {
        // Make Pyramid
        int rows = 10;
        for(int i = 0; i <=rows; i++){
            for (int j = 0; j < i; j++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
