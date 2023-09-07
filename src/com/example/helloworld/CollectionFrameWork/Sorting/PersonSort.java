package com.example.helloworld.CollectionFrameWork.Sorting;

public class PersonSort implements Comparable<PersonSort>{

    private final String firstName;
    private final String lastName;
    public PersonSort(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    @Override
    public int compareTo(PersonSort other) {
        int len1 = this.firstName.length();
        int len2 = this.lastName.length();
        int lim = Math.min(len1, len2);
        char[] v1 = this.firstName.toCharArray();
        char[] v2 = other.firstName.toCharArray();
        int k = 0;
        while (k < lim){
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2){
                return c1-c2;
            }
            k++;
        }
        return len1 - len2;
    }
}
