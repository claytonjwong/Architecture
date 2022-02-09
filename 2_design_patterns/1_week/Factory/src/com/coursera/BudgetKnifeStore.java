package com.coursera;

public class BudgetKnifeStore extends KnifeStore {
    public Knife createKnife(String type) {
        Knife knife = null;
        if (type.equals("butter"))
            knife = new ButterKnife();
        else if (type.equals("steak"))
            knife = new SteakKnife();
        return knife;
    }
}
git s