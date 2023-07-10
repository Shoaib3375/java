package com.example.helloworld.CollectionFrameWork.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(8);
        numbers.add(2);

        System.out.println(numbers);
    }
}
