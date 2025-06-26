// Java program to demonstrate a list of unic elements

package com.uniclist;

import java.util.SortedSet;
import java.util.TreeSet;

// Main class
public class Main {

     // Main method to run java program
    public static void main(String[] args) {

        // Creating a sorted list of unic elements TreeSet for storing a list of purchase
        SortedSet<String> list = new TreeSet<>();

        // Adding elements to a list
        list.add("Bread");
        list.add("Tomatos");
        list.add("Strawberries");
        list.add("Watermelon");
        list.add("Mango");
        list.add("Pork");
        list.add("Eggs");
        list.add("Cottage cheese");
        list.add("Coffee");
        list.add("Onion Porey");
        list.add("Potatos");
        list.add("Garlic");
        list.add("Aubergine");

        // Printing sorted alphabetically list to console
        System.out.println("List: " + list);

        // Printing subset of the list
        System.out.println(list.subSet("Cottage Cheese", "Potatoes"));

        // Printing first element of the list
        System.out.println(list.first());

        // Printing last element of the list
        System.out.println(list.last());

        // Adding a new element to the list
        list.add("Cucumber");

        // Printing sorted alphabetically list to console
        System.out.println("List: " + list);
    }
}