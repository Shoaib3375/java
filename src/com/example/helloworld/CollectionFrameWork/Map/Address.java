package com.example.helloworld.CollectionFrameWork.Map;

public class Address {
private final String streetName;
private final String city;
private  final String province;
private final String country;
private final String postalCode;
    public Address(String streetName, String city, String province, String country, String postalCode){
    this.streetName = streetName;
    this.city = city;
    this.province = province;
    this.country =country;
    this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\''+
                ", city='" + city + '\'' +
                ", province='" + province +'\''+
                ", country='" + country +'\''+
                ", postalCode='" + postalCode +'\''+
                '}';
    }
}
