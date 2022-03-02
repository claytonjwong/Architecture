package com.example.sharingapp;

import android.content.Context;

import java.util.ArrayList;

public class ContactListController extends Observable {
    private ContactList contact_list;

    ContactListController(ContactList contact_list) {
        this.contact_list = contact_list;
    }

    public void setContacts(ArrayList<Contact> contact_list) {
        this.contact_list.setContacts(contact_list);
    }

    public ArrayList<Contact> getContacts() {
        return contact_list.getContacts();
    }

    public ArrayList<String> getAllUsernames() {
        return contact_list.getAllUsernames();
    }

    public boolean addContact(Context context, Contact contact) {
        AddContactCommand add_contact_command = new AddContactCommand(context, contact_list, contact);
        add_contact_command.execute();
        return add_contact_command.isExecuted();
    }

    public boolean deleteContact(Context context, Contact contact) {
        DeleteContactCommand delete_contact_command = new DeleteContactCommand(context, contact_list, contact);
        delete_contact_command.execute();
        return delete_contact_command.isExecuted();
    }

    public boolean editContact(Context context, Contact old_contact, Contact new_contact) {
        EditContactCommand edit_contact_command = new EditContactCommand(context, contact_list, old_contact, new_contact);
        edit_contact_command.execute();
        return edit_contact_command.isExecuted();
    }

    public Contact getContact(int index) {
        return contact_list.getContact(index);
    }

    public int getSize() {
        return contact_list.getSize();
    }

    public int getIndex(Contact contact) {
        return contact_list.getIndex(contact);
    }

    public boolean hasContact(Contact contact) {
        return contact_list.hasContact(contact);
    }

    public Contact getContactByUsername(String username) {
        return contact_list.getContactByUsername(username);
    }

    public void loadContacts(Context context) {
        contact_list.loadContacts(context);
    }

    public boolean saveContacts(Context context) {
        return contact_list.saveContacts(context);
    }

    public boolean isUsernameAvailable(String username) {
        return contact_list.getContactByUsername(username) == null;
    }

    public void addObserver(IObserver observer) {
        contact_list.addObserver(observer);
    }

    public void removeObserver(IObserver observer) {
        contact_list.removeObserver(observer);
    }
}
