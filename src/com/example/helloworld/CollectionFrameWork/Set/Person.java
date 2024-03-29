package com.example.helloworld.CollectionFrameWork.Set;

public class Person implements Comparable<Person>{
    public String name;
    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person o){
        return this.name.compareTo(o.name);
    }

}
