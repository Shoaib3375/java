package com.example.helloworld.Generics;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.StringJoiner;

public class GenericStack <T>{
    private static final int DEFAULT_CAPACITY = 10;

    private T[] elements;
    private int count;

    public GenericStack(){
        // let's assume initial capacity is 10
        elements = (T[])  new Object[DEFAULT_CAPACITY];
    }

    public void push(T item){
        if (isFull()){
            grow();
        }
    }
    private boolean isFull(){
        return elements.length == count;
    }
    private void grow(){
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements,newCapacity);
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        --count;
        return elements[count];
    }
    public boolean isEmpty(){
        return count == 0;
    }
    public int size(){
        return count;
    }
    public void printElements(){
        StringJoiner joiner = new StringJoiner(", ","[", "]");
        for (int i=0; i<count; i++){
            joiner.add(String.valueOf(elements[i]));
        }
        System.out.println(joiner);
    }
}
