package com.coursera;

public class Main {

    public static void main(String[] args) {
	    CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter();
        adapter.chooseFirstSelection();
        adapter.chooseSecondSelection();
    }
}

/*
Adapter: translation between chooseFirstSelection() -> selectA()
Old coffee: selectA() invoked
Adapter: translation between chooseSecondSelection() -> selectB()
Old coffee: selectB() invoked
*/
