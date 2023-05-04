package com.example.helloworld.Generics;

public class GenericStackDemo {
    public static void main(String[] args) {
        GenericStack<String> cities = new GenericStack<>();
        cities.push("Dhaka");
        cities.push("Toronto");
        cities.push("Ottawa");
        cities.push("Calgary");
        cities.pop();
        cities.printElements();
    }
}
