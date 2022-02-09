package com.coursera;

public class Main {

    public static void main(String[] args) {
        KnifeFactory factory = new KnifeFactory();
        KnifeStore store = new KnifeStore(factory);
	    Knife a = store.orderKnife("butter");
        Knife b = store.orderKnife("steak");
        System.out.println("a: " + a.toString());
        System.out.println("b: " + b.toString());
        for (int i = 0; i < 10; ++i)  a.cut(); // cut some butter
        for (int i = 0; i < 10; ++i)  b.cut(); // cut some steak
        System.out.println("a: " + a.toString());
        System.out.println("b: " + b.toString());
    }
}

/*
a: Butter knife with 1.0 sharpness
b: Steak knife with 100.0 sharpness
Gooey butter cuts easily
Gooey butter cuts easily
Gooey butter cuts easily
Gooey butter cuts easily
Gooey butter cuts easily
Gooey butter cuts easily
Gooey butter cuts easily
Gooey butter cuts easily
Gooey butter cuts easily
Gooey butter cuts easily
Mmm... cutting delicous steak
Mmm... cutting delicous steak
Mmm... cutting delicous steak
Mmm... cutting delicous steak
Mmm... cutting delicous steak
Mmm... cutting delicous steak
Mmm... cutting delicous steak
Mmm... cutting delicous steak
Mmm... cutting delicous steak
Mmm... cutting delicous steak
a: Butter knife with 0.99 sharpness
b: Steak knife with 90.0 sharpness
*/
