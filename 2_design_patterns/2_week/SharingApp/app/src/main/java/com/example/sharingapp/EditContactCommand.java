package com.example.sharingapp;

import android.content.Context;

public class EditContactCommand extends Command {
    private Context context;
    private ContactList contactList;
    private Contact old_contact, new_contact;
    EditContactCommand(Context context, ContactList contactList, Contact old_contact, Contact new_contact) {
        this.context = context;
        this.contactList = contactList;
        this.old_contact = old_contact;
        this.new_contact = new_contact;
    }
    public void execute() {
        contactList.deleteContact(old_contact);
        contactList.addContact(new_contact);
        setExecuted(contactList.saveContacts(context));
    }
}
