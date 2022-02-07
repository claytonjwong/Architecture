package com.coursera;

public class CoffeeTouchscreenAdapter implements ICoffeeMachine {
    private OldCoffeeMachine old;
    public CoffeeTouchscreenAdapter() {
        old = new OldCoffeeMachine();
    }
    public void chooseFirstSelection() {
        System.out.println("Adapter: translation between chooseFirstSelection() -> selectA()");
        old.selectA();
    }
    public void chooseSecondSelection() {
        System.out.println("Adapter: translation between chooseSecondSelection() -> selectB()");
        old.selectB();
    }
}
