package com.example.sharingapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.Observer;

/**
* ItemListController is responsible for all communication between views and ItemList object
*/
public class ItemListController {

   private ItemList item_list;

   public ItemListController(ItemList item_list){
       this.item_list = item_list;
   }

   public void setItems(ArrayList<Item> item_list) {
       this.item_list.setItems(item_list);
   }

   public ArrayList<Item> getItems() {
       return item_list.getItems();
   }

   public boolean addItem(Item item, Context context){
       AddItemCommand add_item_command = new AddItemCommand(context, item_list, item);
       add_item_command.execute();
       return add_item_command.isExecuted();
   }

   public boolean deleteItem(Item item, Context context) {
       DeleteItemCommand delete_item_command = new DeleteItemCommand(context, item_list, item);
       delete_item_command.execute();
       return delete_item_command.isExecuted();
   }

   public boolean editItem(Item item, Item updated_item, Context context){
       EditItemCommand edit_item_command = new EditItemCommand(context, item_list, item, updated_item);
              edit_item_command.execute();
       return edit_item_command.isExecuted();
   }

   public Item getItem(int index) {
       return item_list.getItem(index);
   }

   public int getIndex(Item item) {
       return item_list.getIndex(item);
   }

   public int getSize() {
       return item_list.getSize();
   }

   public void loadItems(Context context) {
       item_list.loadItems(context);
   }

   public ArrayList<Contact> getActiveBorrowers() {
       return item_list.getActiveBorrowers();
   }

   public ArrayList<Item> filterItemsByStatus(String status){
       return item_list.filterItemsByStatus(status);
   }

   public void addObserver(IObserver observer) {
       item_list.addObserver(observer);
   }

   public void removeObserver(IObserver observer) {
       item_list.removeObserver(observer);
   }
}
