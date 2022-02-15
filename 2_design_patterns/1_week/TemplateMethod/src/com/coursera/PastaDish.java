package com.coursera;

abstract public class PastaDish {
    abstract void addPasta();
    abstract void addSauce();
    abstract void addMeat();
    abstract void addGarnish();
    public void makeRecipe() {
        boilWater();
        addPasta();
        cookPasta();
        drainAndPlate();
        addSauce();
        addMeat();
        addGarnish();
    }
    public void boilWater() {
        System.out.println("Boiling water");
    }
    public void cookPasta() {
        System.out.println("Cooking pasta");
    }
    public void drainAndPlate() {
        System.out.println("Drain pasta and place on a plate");
    }
}
