package com.example.helloworld.CollectionFrameWork.Sorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSort {
    public static void main(String[] args) {
        List<Integer> listB = new LinkedList<>();
        listB.add(15);
        listB.add(13);
        listB.add(20);
        Collections.sort(listB);
        System.out.println(listB);
    }
}
