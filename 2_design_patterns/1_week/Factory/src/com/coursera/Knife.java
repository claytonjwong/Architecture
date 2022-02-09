package com.coursera;

public class Knife {
    protected double sharpness;
    private String type;
    public Knife(String type) {
        this.type = type;
    }
    public double getSharpness() {
        return sharpness;
    }
    public String type() {
        return type;
    }
    public void cut() {
        System.out.println("Implement me");
    }
    public void sharpen() {
        System.out.println("Implement me");
    }
    public String toString() {
        return this.type + " knife with " + sharpness + " sharpness";
    }
}
