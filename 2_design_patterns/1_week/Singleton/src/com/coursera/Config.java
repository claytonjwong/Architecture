package com.coursera;

class Config {
    public int red;
    public int white;
    public int blue;
    private Config() {
        red = 0;
        white = 0;
        blue = 0;
    }
    private static Config config = null;
    public static Config getInstance() {
        if (config == null)
            config = new Config();
        return config;
    }
}