package com.example.helloworld.CollectionFrameWork.Set;

import java.util.Set;
import java.util.TreeSet;

public class PersonDemo {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("Rokon"));
        persons.add(new Person("Shoaib"));
        persons.add(new Person("Muzzamel Haque"));
        persons.add(new Person("Mizanur Rahman"));

        for (Person person : persons){
            System.out.println(person);
        }
    }
}
