package com.example.helloworld.CollectionFrameWork.Map;



import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    public static void main(String[] args) {
        Map<Person, Address> addressBook = new HashMap<>();
        Person person = new Person("BazlurR");
        Address address = new Address(
                "15A Kazi Nazrul Islam Rd", "Dhanmondi", "Dhaka","Bangladesh", "4200)"
        );
        Person person1 = new Person("Bazlur");
        Person person2 = new Person("Bazlur");
        addressBook.put(person1, address);
        addressBook.put(person2, address);

//        addressBook.put(person, address);
        System.out.println(addressBook);
    }
}
