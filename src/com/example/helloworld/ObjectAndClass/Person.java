package com.example.helloworld.ObjectAndClass;
// Constructor without use this keyword
public class Person {
    private String name;
    private String email;
    private int age;
    // if field name and Constructor parameter name not same . then we didn't use this keyword.
    public Person(String personName, String emailAddress, int personAge){
        name = personName;
        email = emailAddress;
        age = personAge;
    }
//    public Person(String name, String email, int age){
//        this.name = name;
//        this.email = email;
//        this.age = age;
//    }

    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
    }
}
