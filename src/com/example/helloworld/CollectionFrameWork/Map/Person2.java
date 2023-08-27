package com.example.helloworld.CollectionFrameWork.Map;


import java.util.Objects;

public class Person2 implements Comparable<Person2> {
    public String name;

    public Person2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    @Override
    public int compareTo(Person2 o) {
        return this.name.compareTo(o.name);
    }


}
