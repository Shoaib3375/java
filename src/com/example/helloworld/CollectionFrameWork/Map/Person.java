package com.example.helloworld.CollectionFrameWork.Map;

import java.util.Objects;

public class Person {
    public  String name;
    public Person(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
