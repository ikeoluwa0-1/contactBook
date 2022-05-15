package org.example;

import java.util.HashMap;
import java.util.Objects;

public class Contact {
    HashMap<String, String> phoneBook = new HashMap<>();

    public void addNewContact(String name, String number){
        if (this.phoneBook.containsKey(name)) {
            System.out.println("Name already exists.");
        } else {
            this.phoneBook.put(name, number);
            System.out.println("Contact added successfully!");
        }
    }

    public void searchName(String name){
        for (String i : this.phoneBook.keySet()){
            if (Objects.equals(i, name)){
                System.out.println("name and number exists: ");
                System.out.println(i + " : " + this.phoneBook.get(i));
                break;
            } else {
                System.out.println("name not found!");
                break;
            }
        }
    }

    public void printContactList(){
        for (String i : this.phoneBook.keySet()){
            System.out.println(i + " : " + this.phoneBook.get(i));
        }
    }
}
