package com.example.helloworld.CollectionFrameWork.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Person2, String> phoneBook = new TreeMap<>();

        Person2 mozammel = new Person2("Mozammel");
        Person2 subeen = new Person2("Subeen");
        Person2 rafi = new Person2("Rafi");
        Person2 salman = new Person2("Salman");

        phoneBook.put(rafi, "01738293829");
        phoneBook.put(mozammel, "03282382");
        phoneBook.put(subeen, "03282382");
        phoneBook.put(salman, "03282382");

        for (Map.Entry<Person2, String> entry:
        phoneBook.entrySet()){
            System.out.println(entry.getKey().toString()+
                    " - " + entry.getValue());
        }
    }
}
