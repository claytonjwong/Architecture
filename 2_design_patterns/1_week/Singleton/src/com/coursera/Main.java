package com.coursera;

public class Main {

    public static void main(String[] args) {
        Config config = Config.getInstance(); // FIXME: thread safety
        config.red = 1;
        config.white = 2;
        config.blue = 3;
        System.out.println("God bless America! red: " + config.red + " white: " + config.white + " blue: " + config.blue);
        // God bless America! red: 1 white: 2 blue: 3
    }
}
