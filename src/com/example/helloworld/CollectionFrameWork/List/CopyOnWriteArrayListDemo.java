package com.example.helloworld.CollectionFrameWork.List;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        List<String> topCompany = new CopyOnWriteArrayList<>();
        topCompany.add("Apple");
        topCompany.add("Amazone");
        topCompany.add("Saudi Aramco");
        topCompany.add("Google");
        topCompany.add("Microsoft");
        System.out.println(topCompany);
    }
}
