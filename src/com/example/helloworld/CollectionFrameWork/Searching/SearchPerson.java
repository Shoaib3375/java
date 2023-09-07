package com.example.helloworld.CollectionFrameWork.Searching;

public class SearchPerson implements Comparable<SearchPerson>{
    private String name;
    public SearchPerson(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public int compareTo(SearchPerson o) {
        return this.name.compareTo(o.getName());
    }
}
