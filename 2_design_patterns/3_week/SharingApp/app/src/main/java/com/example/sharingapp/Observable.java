package com.example.sharingapp;

import java.util.ArrayList;
import java.util.Observer;

public class Observable {
    private ArrayList<IObserver> observers = null;

    public Observable() {
        observers = new ArrayList<>();
    }

    public void notifyObservers() {
        for (IObserver observer: observers)
            observer.update();
    }

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        if (observers.contains(observer))
            observers.remove(observer);
    }
}
