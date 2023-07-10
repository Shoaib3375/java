package com.example.helloworld.CollectionFrameWork.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> topCities = new LinkedList<>();
        topCities.add("London");
        topCities.add("Paris");
        topCities.add("Barcelona");
        topCities.add("Istanbul");
        System.out.println(topCities);
    }
}
