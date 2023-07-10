package com.example.helloworld.CollectionFrameWork.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < 10; i++){
            deque.push(i);
        }
        while (!deque.isEmpty()){
            Integer value = deque.pop();
            System.out.print(value + ", ");
        }
    }
}
