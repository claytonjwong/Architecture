package com.coursera;

public class ButterKnife extends Knife {
    public static final double INITIAL_SHARPNESS = 1.0;
    public ButterKnife() {
        super("Butter");
        sharpness = INITIAL_SHARPNESS;
    }
    public void cut() {
        System.out.println("Gooey butter cuts easily");
        sharpness -= 0.001;
    }
    public void sharpen() {
        sharpness = INITIAL_SHARPNESS;
    }
}
