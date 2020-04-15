package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryItems() {
        System.out.println("You have " + groceryList.size() + " items in your Grocery list!");
        for (int i=0; i<groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
        System.out.println(item + " was successfully added!");
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0) {
            groceryList.remove(position);
            System.out.println("Item was removed!");
        } else {
            System.out.println("Not able to find the item!");
        }
    }

    public void modifyGroceryItem (String oldItem, String newItem) {
        int position = findItem(oldItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem (int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    private int findItem(String item) {
        return groceryList.indexOf(item);
    }

    public  boolean onFile(String item) {
        int position = findItem(item);
        if (position >= 0) {
            return true;
        } else {
            return false;
        }
    }
}

