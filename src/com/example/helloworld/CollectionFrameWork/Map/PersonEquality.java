package com.example.helloworld.CollectionFrameWork.Map;

public class PersonEquality {
    public static void main(String[] args) {
        Person person1 = new Person("Bazlur");
        Person person2 = new Person("Bazlur");

        if (person2.equals(person2)){
            System.out.println("Both are equal");
        }else {
            System.out.println("They are not equal");
        }
    }
}
