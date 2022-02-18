package com.example.sharingapp;

import android.content.Context;

public class AddItemCommand extends Command {
    private Context context;
    private ItemList itemList;
    private Item item;
    AddItemCommand(Context context, ItemList itemList, Item item) {
        this.context = context;
        this.itemList = itemList;
        this.item = item;
    }
    public void execute() {
        itemList.addItem(item);
        setExecuted(itemList.saveItems(context));
    }
}
