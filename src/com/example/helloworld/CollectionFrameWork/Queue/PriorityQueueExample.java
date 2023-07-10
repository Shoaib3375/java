package com.example.helloworld.CollectionFrameWork.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Customer> customers = new PriorityQueue<>();

        customers.offer(new Customer("Customer 1", 14));
        customers.offer(new Customer("Customer 2", 135));
        customers.offer(new Customer("Customer 3", 15));
        customers.offer(new Customer("Customer 4", 12));
        customers.offer(new Customer("Customer 5", 40));

        while (!customers.isEmpty()){
            Customer customer = customers.poll();
            serve(customer);
        }
    }
    private static void serve(Customer customer){
        System.out.println("Serving customer - name: " +
                customer.getName() + ", age: " + customer.getAge());
    }
}
