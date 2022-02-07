package com.coursera;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Order> A = new ArrayList<>() {
            {
                add(new Order("a big mac"));
                add(new Order("a large french fry"));
                add(new Order("a liter of cola"));
                add(new Order("another liter of cola"));
            }
        };
        OrderFulfillment orderTaker = new OrderFulfillment();
        for (Order order: A) {
            orderTaker.fulfillOrder(order);
        }
        /*
            Los Angeles generates a big mac
            Seattle produces a large french fry
            New York magically enchants a liter of cola
            Phoenix conjures another liter of cola
        */
    }
}
