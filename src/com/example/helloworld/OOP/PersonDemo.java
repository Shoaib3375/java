package com.example.helloworld.OOP;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person("Bazlur");
        System.out.println(person.getName());
        person.name = "Nafis";
        System.out.println(person.name);
    }
}
