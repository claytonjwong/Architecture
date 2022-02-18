package com.example.sharingapp;

import android.content.Context;

public class AddContactCommand extends Command {
    private Context context;
    private ContactList contactList;
    private Contact contact;
    AddContactCommand(Context context, ContactList contactList, Contact contact) {
        this.context = context;
        this.contactList = contactList;
        this.contact = contact;
    }
    public void execute() {
        contactList.addContact(contact);
        setExecuted(contactList.saveContacts(context));
    }
}
