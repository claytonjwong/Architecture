package com.example.sharingapp;

import android.content.Context;

import java.util.ArrayList;

public class ContactListController {
    private ContactList contactList;

    ContactListController(ContactList contactList) {
        this.contactList = contactList;
    }

    public void setContacts(ArrayList<Contact> contactList) {
        this.contactList.setContacts(contactList);
    }

    public ArrayList<Contact> getContacts() {
        return contactList.getContacts();
    }

    public ArrayList<String> getAllUsernames() {
        return contactList.getAllUsernames();
    }

    public boolean addContact(Context context, Contact contact) {
        AddContactCommand add_contact_command = new AddContactCommand(context, contactList, contact);
        add_contact_command.execute();
        return add_contact_command.isExecuted();
    }

    public boolean deleteContact(Context context, Contact contact) {
        DeleteContactCommand delete_contact_command = new DeleteContactCommand(context, contactList, contact);
        delete_contact_command.execute();
        return delete_contact_command.isExecuted();
    }

    public boolean editContact(Context context, Contact old_contact, Contact new_contact) {
        EditContactCommand edit_contact_command = new EditContactCommand(context, contactList, old_contact, new_contact);
        edit_contact_command.execute();
        return edit_contact_command.isExecuted();
    }

    public Contact getContact(int index) {
        return contactList.getContact(index);
    }

    public int getSize() {
        return contactList.getSize();
    }

    public int getIndex(Contact contact) {
        return contactList.getIndex(contact);
    }

    public boolean hasContact(Contact contact) {
        return contactList.hasContact(contact);
    }

    public Contact getContactByUsername(String username) {
        return contactList.getContactByUsername(username);
    }

    public void loadContacts(Context context) {
        contactList.loadContacts(context);
    }

    public boolean saveContacts(Context context) {
        return contactList.saveContacts(context);
    }

    public boolean isUsernameAvailable(String username) {
        return contactList.getContactByUsername(username) == null;
    }
}
