package com.coursera;

public class KnifeStore {
    private KnifeFactory factory;
    public KnifeStore(KnifeFactory factory) {
        this.factory = factory;
    }
    public Knife orderKnife(String type) {
        return factory.createKnife(type);
    }
}
