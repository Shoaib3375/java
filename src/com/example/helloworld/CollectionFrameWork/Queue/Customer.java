package com.example.helloworld.CollectionFrameWork.Queue;

public class Customer implements  Comparable<Customer>{
    private final String name;
    private final int age;

    public Customer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    @Override
    public int compareTo(Customer o) {
        return Integer.compare(o.age, this.age);
    }
}
