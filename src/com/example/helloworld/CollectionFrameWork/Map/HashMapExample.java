package com.example.helloworld.CollectionFrameWork.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> citiesWithPopulation = new HashMap<>();

        citiesWithPopulation.put("Tokyo", 37_400_068);
        citiesWithPopulation.put("Delhi", 28_514_000);
        citiesWithPopulation.put("Dhaka", 19_578_000);
        citiesWithPopulation.put("New York", 8_601_186);
        citiesWithPopulation.put("Istanbul", 15_519_267);

        Integer population = citiesWithPopulation.get("Dhaka");
        System.out.println("Population of Dhaa = " + population);
        Set<String> keys = citiesWithPopulation.keySet();
        Collection<Integer> values = citiesWithPopulation.values();

        boolean dhakaExist = citiesWithPopulation.containsKey("Dhaka");
        System.out.println("dhakaExist = " + dhakaExist);
        boolean containsValue = citiesWithPopulation.containsValue(37400068);
        System.out.println("containsValue = " + containsValue);

        int total = citiesWithPopulation.size();
        System.out.println("Total " + total);
        
        System.out.println(citiesWithPopulation);
        System.out.println(population);
        System.out.println("Keys = " + keys);
        System.out.println("Values = " + values);
    }
}
