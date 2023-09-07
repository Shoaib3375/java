package com.example.helloworld.CollectionFrameWork.Searching;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {
    public static void main(String[] args) {
        List<SearchPerson> searchPerson = new ArrayList<>();
        searchPerson.add(new SearchPerson("Rahim"));
        searchPerson.add(new SearchPerson("Karim"));
        searchPerson.add(new SearchPerson("Shoaib"));
        searchPerson.add(new SearchPerson("Uday"));
        searchPerson.add(new SearchPerson("Rimon"));
        searchPerson.add(new SearchPerson("Farhan"));
        Collections.sort(searchPerson);
        SearchPerson key = new SearchPerson("Rahim");
        int index = Collections.binarySearch(searchPerson, key);
        if (index >= 0){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
