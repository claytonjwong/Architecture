package com.example.sharingapp;

abstract public class Command {
    private boolean isExecuted;
    public Command() {
        isExecuted = false;
    }
    public abstract void execute();
    public void setExecuted(boolean isExecuted) {
        this.isExecuted = isExecuted;
    }
    public boolean isExecuted() {
        return isExecuted;
    }
}
