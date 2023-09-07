package com.example.helloworld.CollectionFrameWork.Searching;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] array  = {30, 20, 5, 12, 55};
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
        int searchValue = 12;
        int index = Arrays.binarySearch(array, searchValue);
        System.out.println("The index of element 12 is : " + index);
    }
}
