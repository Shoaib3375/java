package com.example.helloworld.CollectionFrameWork.Sorting;



import java.util.Arrays;

public class ObjectArraySort {
    public static void main(String[] args) {
        PersonSort[] persons = new PersonSort[]{
                new PersonSort("Person # 2", "Person")
        };
        Arrays.sort(persons, (o1, o2) -> o1.getFirstName().compareTo(o2.getLastName()));
        System.out.println(Arrays.toString(persons));
    }
}
