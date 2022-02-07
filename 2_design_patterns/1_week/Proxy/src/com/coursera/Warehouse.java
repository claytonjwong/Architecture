package com.coursera;

public class Warehouse {
    public String name;
    public String process;
    public Warehouse(String name, String process) {
        this.name = name;
        this.process = process;
    }
    public void fulfillOrder(Order o) {
        System.out.println(name + " " + process + " " + o.toString());
    }
}
