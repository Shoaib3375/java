package com.example.helloworld.fiveChapter;

public class ArrayStructure {
    public static void main(String[] args) {
        int[] anArray; // It's good Practice :D
//        int anArray[]; // we define an array. but it's not Good Practice :D
        anArray = new int[10]; // we limit array item or value

        anArray[0] = 100; // 1st value
        anArray[1] = 200; // 2nd value
        anArray[2] = 300; // 3rd value


        System.out.println("First array value " + anArray[0]);
        System.out.println("2nd array value " + anArray[1]);
        System.out.println("3rd array value " + anArray[2]);

        // we can write array using shortcut.
        // It's called Array initialize
        int [] nums = {100, 200, 300, 400, 500, 600,700};
        double[] num2 = {1.2, 3.2, 5.3};
        System.out.println(); // we can't get write value :(
        // we should need to processing array

    }
}
