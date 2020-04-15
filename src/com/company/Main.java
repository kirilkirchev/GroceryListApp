package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        printInstructions();
        boolean quit = false;

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printItems();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void printItems () {
        groceryList.printGroceryItems();
    }

    public static void addItem () {
        System.out.println("Please enter the item you would like to add:");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void searchItem () {
        System.out.println("Which item you would like to find: ");
        String item = scanner.nextLine();
        if (groceryList.onFile(item)) {
            System.out.println("We found your item.");
        } else {
            System.out.println("Item not in the list!");
        }
    }

    public static void removeItem() {
        System.out.println("Which item you would like to remove: ");
        groceryList.removeGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Which item you would like to modify: ");
        String oldItem = scanner.nextLine();
        System.out.println("Which is the new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(oldItem, newItem);
    }
}
