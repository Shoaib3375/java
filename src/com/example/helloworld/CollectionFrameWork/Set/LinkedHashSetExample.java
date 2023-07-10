package com.example.helloworld.CollectionFrameWork.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();

        cities.add("Dhaka");
        cities.add("Jessore");
        cities.add("Mymensingh");
        cities.add("Mymensingh");
        cities.add("Cox's Bazar");
        cities.add("Cox's Bazar");

        System.out.println("Total cities: " + cities.size());
        System.out.println(cities);
    }
}
