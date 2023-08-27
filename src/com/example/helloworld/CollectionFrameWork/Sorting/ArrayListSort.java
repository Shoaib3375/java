package com.example.helloworld.CollectionFrameWork.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>();
        listA.add(5);
        listA.add(3);
        listA.add(2);
        Collections.sort(listA);
        System.out.println(listA);
    }
}
