package com.example.helloworld.Array;

public class processArray {
    public static void main(String[] args) {
        int[] myArray = {-45, 1, 8, 4, 5, 105};

        System.out.println("Index\tValue");

        for (int i = 0; i < myArray.length; i++){
            System.out.println(i + "\t\t" + myArray[i]);
        }
    }
}
