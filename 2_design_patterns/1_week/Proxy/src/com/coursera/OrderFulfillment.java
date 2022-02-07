package com.coursera;

import java.util.ArrayList;

public class OrderFulfillment implements IOrder {
    private ArrayList<Warehouse> A = new ArrayList<>() {
        {
            add(new Warehouse("Los Angeles", "generates"));
            add(new Warehouse("Seattle", "produces"));
            add(new Warehouse("New York", "magically enchants"));
            add(new Warehouse("Phoenix", "conjures"));
        }
    };
    private int N = A.size();
    private int i = 0;
    public void fulfillOrder(Order o) {
        A.get(i).fulfillOrder(o);
        i = (i + 1) % N;
    }
}
