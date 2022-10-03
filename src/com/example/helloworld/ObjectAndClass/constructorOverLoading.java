package com.example.helloworld.ObjectAndClass;

public class constructorOverLoading {
    private final String name;
    private String  email;
    private int age;

    public  constructorOverLoading(String name){
        this.name = name;
    }
    public constructorOverLoading(String name, String email){
        this.name = name;
        this.email = email;
    }
    public constructorOverLoading(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        constructorOverLoading shoaib = new constructorOverLoading("Shoaib", "mestabd60@gmail.com",19);
        constructorOverLoading mesta = new constructorOverLoading("mesta");
        shoaib.printInfo();
        mesta.printInfo();

    }
}
