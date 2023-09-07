package com.example.helloworld.CollectionFrameWork.Sorting;


import java.util.Arrays;
import java.util.Random;

public class ArrayExample2 {
    public static void main(String[] args) {
        char[] array = new char[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = (char) (random.nextInt(26) + 'A');
        }
        System.out.println("Array before sort: ");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Array after sort: ");
        System.out.println(Arrays.toString(array));
    }
}
