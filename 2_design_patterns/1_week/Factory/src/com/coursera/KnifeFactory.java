package com.coursera;

public class KnifeFactory {
    public Knife createKnife(String type) {
        Knife knife = null;
        if (type.equals("butter"))
            knife = new ButterKnife();
        else if (type.equals("steak"))
            knife = new SteakKnife();
        return knife;
    }
}
