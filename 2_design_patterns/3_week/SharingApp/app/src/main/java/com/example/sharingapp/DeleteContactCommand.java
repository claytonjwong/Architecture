package com.example.sharingapp;

import android.content.Context;

public class DeleteContactCommand extends Command {
    private Context context;
    private ContactList contactList;
    private Contact contact;
    DeleteContactCommand(Context context, ContactList contactList, Contact contact) {
        this.context = context;
        this.contactList = contactList;
        this.contact = contact;
    }
    public void execute() {
        contactList.deleteContact(contact);
        setExecuted(contactList.saveContacts(context));
    }
}
