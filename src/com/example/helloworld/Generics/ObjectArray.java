package com.example.helloworld.Generics;

public class ObjectArray {
    public static void main(String[] args) {
        DynamicArray<String> stringArray = new DynamicArray<>();
//        DynamicArray<Object> objectArray = stringArray; // illigal
//        objectArray.add(new Object());
        String item = stringArray.get(0);

    }
}
