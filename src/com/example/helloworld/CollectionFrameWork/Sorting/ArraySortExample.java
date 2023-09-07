package com.example.helloworld.CollectionFrameWork.Sorting;

import java.util.Arrays;
import java.util.Random;

public class ArraySortExample {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(10) + 1;
        }
        System.out.println("Array before sort: ");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Array after sort: ");
        System.out.println(Arrays.toString(array));
    }
}
