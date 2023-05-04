package com.example.helloworld.Generics;

public class TupleDemo {
    public static void main(String[] args) {
        Tuple<String, String> tuple = new Tuple<>("Shoaib","Islam");
        tuple.showTypes();
        Tuple<String,Integer> person = new Tuple<>("Mesta", 20);
        person.showTypes();
    }
}
