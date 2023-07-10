package com.example.helloworld.CollectionFrameWork.List;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimitiveArrayExample {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 , 4, 5, 4, 5};
        List<Integer> numbers = IntStream.of(array).boxed().collect(Collectors.toList());
        System.out.println(numbers);
    }
}
