package com.example.helloworld.CollectionFrameWork.Sorting;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonSortExample {
    public static void main(String[] args) {
        List<PersonSort> personSorts = new ArrayList<>();
        personSorts.add(new PersonSort("James", "Gosling"));
        personSorts.add(new PersonSort("Gavin", "King"));
        personSorts.add(new PersonSort("Rod", "Johnson"));
        personSorts.add(new PersonSort("Craig", "McLachlan"));
        Collections.sort(personSorts);

        for (PersonSort p : personSorts){
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }
    }
}
