package com.example.sharingapp;

import android.content.Context;

public class DeleteItemCommand extends Command {
    private Context context;
    private ItemList itemList;
    private Item item;
    DeleteItemCommand(Context context, ItemList itemList, Item item) {
        this.context = context;
        this.itemList = itemList;
        this.item = item;
    }
    public void execute() {
        itemList.deleteItem(item);
        setExecuted(itemList.saveItems(context));
    }
}
