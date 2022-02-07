package com.coursera;

import java.util.ArrayList;

public class Playlist implements IComponent {
    public String name;
    public ArrayList<IComponent> playlist;
    public float speed;
    public Playlist(String name) {
        this.name = name;
        playlist = new ArrayList<>();
        speed = 1.0f;
    }
    public void play() {
        System.out.println("Play playlist " + name + " at speed " + speed);
    }
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }
    public String getName() {
        return name;
    }
    public void add(IComponent component) {
        playlist.add(component);
    }
    public void remove(IComponent component) {
        playlist.remove(component);
    }
}
