package com.coursera;

public class SteakKnife extends Knife {
    private static final double INITIAL_SHARPNESS = 100.0;
    public SteakKnife() {
        super("Steak");
        sharpness = INITIAL_SHARPNESS;
    }
    public void cut() {
        System.out.println("Mmm... cutting delicous steak");
        sharpness -= 1.0;
    }
    public void sharpen() {
        sharpness = INITIAL_SHARPNESS;
    }
}
