package com.example.helloworld.CollectionFrameWork.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> topCities = new ArrayList<>();
        topCities.add("London");
        topCities.add("Tokyo");
        topCities.add("Istanbul");
        topCities.add("Siul");
        topCities.add("Moscow");
        topCities.add("Barlin");
        topCities.add("Dubai");
        topCities.add("Dubai");
        int firstIdexTokyo = topCities.indexOf("Tokyo");
        int lastIndexofToronto = topCities.lastIndexOf("Barlin");

        int totalCities = topCities.size();
        String secondCity = topCities.get(1);
//        topCities.set(1,"Washington DC");
//        topCities.remove(1);
//        boolean isTokyoAdded = topCities.contains("Tokyo");
//        System.out.println(lastIndexofToronto);

        System.out.println("Top cities " + topCities);
        System.out.println(totalCities);
//        System.out.println(isTokyoAdded);
        System.out.println("Second city in the list: " + secondCity);
    }
}
