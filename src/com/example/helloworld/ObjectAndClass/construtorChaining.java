package com.example.helloworld.ObjectAndClass;

public class construtorChaining {
    // in previous ConstructorOverloading overload 3 times. but it's not good practice. cause 1st constructor 1st line has 2nd & 3rd constructor.
    // so, this problem solve using Constructor Chaining
    private String name;
    private String email;
    private int age;

    public construtorChaining(String name, String email, int age){
        this(name, email);
        this.age = age;
    }
    public construtorChaining(String name, String email){
        this(name);
        this.email = email;
    }
    public construtorChaining(String name){
        this.name = name;
    }

}
