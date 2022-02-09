package com.coursera;

public abstract class KnifeStore {
    public Knife orderKnife(String type) {
        Knife knife = createKnife(type);
        knife.sharpen();
        return knife;
    }
    abstract Knife createKnife(String type);
}
