package com.example.sharingapp;

import android.content.Context;

public class EditItemCommand extends Command {
    private Context context;
    private ItemList itemList;
    private Item old_item, new_item;
    EditItemCommand(Context context, ItemList itemList, Item old_item, Item new_item) {
        this.context = context;
        this.itemList = itemList;
        this.old_item = old_item;
        this.new_item = new_item;
    }
    public void execute() {
        itemList.deleteItem(old_item);
        itemList.addItem(new_item);
        setExecuted(itemList.saveItems(context));
    }
}
