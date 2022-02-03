package com.example.sharingapp;

import java.util.UUID;

public class Contact {

    private String username;
    private String email;
    private String id;

    public Contact(String username, String email, String id) {
        this.username = username;
        this.email = email;
        if (id == null) {
            setId();
        } else {
            updateId(id);
        }
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void updateId(String id) {
        this.id = id;
    }

    public void setUsername() {
        // not implemented
    }

    public String getUsername() {
        return username;
    }

    public void setEmail() {
        // not implemented
    }

    public String getEmail() {
        return email;
    }
}
