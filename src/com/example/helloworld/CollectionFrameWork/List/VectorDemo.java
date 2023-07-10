package com.example.helloworld.CollectionFrameWork.List;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        List<String> topCities = new Vector<>();

        topCities.add("London");
        topCities.add("New York");
        topCities.add("Paris");
        topCities.add("Moscow");
        topCities.add("Tokyo");
        topCities.add("Dubai");
        topCities.add("Barcelona");
        System.out.println(topCities);
    }
}
