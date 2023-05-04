package com.example.helloworld.Generics;

public class GenericClassDemo {
    public static void main(String[] args) {
        Generic<Integer> iobj;
        iobj = new Generic<>(83);
        iobj.showType();
        int value = iobj.getObj();

        System.out.println("Value = " + value);

        Generic<String> stringGeneric = new Generic<>("This value is test");
        stringGeneric.showType();
        String stringValue = stringGeneric.getObj();
        System.out.println("strValue = " + stringValue);
    }
}
