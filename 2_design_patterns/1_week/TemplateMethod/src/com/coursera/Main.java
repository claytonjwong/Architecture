package com.coursera;

public class Main {

    public static void main(String[] args) {
	    PastaDish pastaDish = new PastaDish() {
            @Override
            void addPasta() {
                System.out.println("adding ooey gooey pasta");
            }
            @Override
            void addSauce() {
                System.out.println("well, might as well throw in some cream of some young guy");
            }
            @Override
            void addMeat() {
                System.out.println("add leftover cow testicles, they are a good source of iron");
            }
            @Override
            void addGarnish() {
                System.out.println("addition condiments are not required");
            }
        };
        pastaDish.makeRecipe();
        PastaDish spaghetti = new SpaghettiMeatballs();
        spaghetti.makeRecipe();
        /*
            Boiling water
            adding ooey gooey pasta
            Cooking pasta
            Drain pasta and place on a plate
            well, might as well throw in some cream of some young guy
            add leftover cow testicles, they are a good source of iron
            addition condiments are not required
            Boiling water
            Add spaghetti
            Cooking pasta
            Drain pasta and place on a plate
            Add tomato sauce
            Add meatballs
            Add Parmesan cheese
        */
    }
}
