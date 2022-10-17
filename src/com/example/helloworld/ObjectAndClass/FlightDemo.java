package com.example.helloworld.ObjectAndClass;

public class FlightDemo {
    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.addOnePassenger();
//        flight.addOnePassenger(2);
        flight.addOnePassenger(2,2);
        int totalCheckedBags = flight.getTotalCheckedBags();
        System.out.println("total checked bags = " +totalCheckedBags);
        int totalPassengers = flight.getTotalPassengers();
        System.out.println("total passengers = " + totalPassengers);

    }
}
