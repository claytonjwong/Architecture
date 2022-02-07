package com.coursera;

public class Song implements IComponent {
    public String name;
    public String artist;
    public float speed;
    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.speed = 1.0f;
    }
    public void play() {
        System.out.println("Play song " + name + " by " + artist + " at speed " + speed);
    }
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }
    public String getName() {
        return name;
    }
    public double speed() {
        return speed;
    }
    public String getArtist() {
        return artist;
    }
}
