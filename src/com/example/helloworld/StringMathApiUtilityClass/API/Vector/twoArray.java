package com.example.helloworld.StringMathApiUtilityClass.API.Vector;

public class twoArray {
    public int[] addTwoScalarArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        for(int i = 0; i< arr1.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }

    public static void main(String[] args) {

    // Create an instance of twoArray class
    twoArray arrayAdder = new twoArray();

    // Create two sample arrays
    int[] array1 = {1, 2, 3, 4, 5};
    int[] array2 = {6, 7, 8, 9, 10};


    int[] sum = arrayAdder.addTwoScalarArrays(array1, array2);


    System.out.println("\nSum of arrays:");
    for (int num : sum) {
        System.out.print(num + " ");
    }


    }
}
