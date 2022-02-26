package com.example.sharingapp;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class ContactList extends Observable {

    private ArrayList<Contact> contacts;
    private String FILENAME = "contacts.sav";

    ContactList() {
        contacts = new ArrayList<>();
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
        notifyObservers();
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public ArrayList<String> getAllUsernames() {
        ArrayList<String> usernames = new ArrayList<>();
        for (Contact c: contacts) {
            usernames.add(c.getUsername());
        }
        return usernames;
    }

    public void addContact(Contact c) {
        contacts.add(c);
    }

    public void deleteContact(Contact c) {
        contacts.remove(c);
        notifyObservers();
    }

    public Contact getContact(int index) {
        if (index < contacts.size())
            return contacts.get(index);
        else
            return null;
    }

    public int getSize() {
        return contacts.size();
    }

    public int getIndex(Contact c) {
        int N = contacts.size();
        int i = 0;
        while (i < N && !contacts.get(i).getId().equals(c.getId()))
            ++i;
        return i;
    }

    public boolean hasContact(Contact c) {
        return getIndex(c) < getSize();
    }

    public Contact getContactByUsername(String username) {
        for (Contact c: contacts)
            if (c.getUsername() == username)
                return c;
        return null;
    }

    public void loadContacts(Context context) {
        try {
            FileInputStream fis = context.openFileInput(FILENAME);
            InputStreamReader isr = new InputStreamReader(fis);
            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<Contact>>() {}.getType();
            contacts = gson.fromJson(isr, listType); // temporary
            fis.close();
        } catch (FileNotFoundException e) {
            contacts = new ArrayList<>();
        } catch (IOException e) {
            contacts = new ArrayList<>();
        }
        notifyObservers();
    }

    public boolean saveContacts(Context context) {
        try {
            FileOutputStream fos = context.openFileOutput(FILENAME, 0);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Gson gson = new Gson();
            gson.toJson(contacts, osw);
            osw.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean isUsernameAvailable(String username) {
        return getContactByUsername(username) == null;
    }
}
