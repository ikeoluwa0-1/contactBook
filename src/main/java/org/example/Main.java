package org.example;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    //    private static Contacts contacts;
    private static final Contact contacts  = new Contact();
    private static final Scanner input = new Scanner(System.in);
    private static void printInstructions(){
        System.out.println("""
        1: Add new contact        
        2. Search for new contact     
        3. Print instructions  
        4. Print contact list   
        5. Quit program.""");

    }

    public static void main(String[] args) {

        printInstructions();
        int selectedOption;
        boolean quit = false;
        while(!quit){
            System.out.println("Choose Option: ");
            selectedOption = input.nextInt();
            input.nextLine();
            switch (selectedOption) {
                case 1 -> {
                    System.out.println("Add Name: ");
                    String name = input.nextLine();
                    System.out.println("Add Number: ");
                    String number = input.nextLine();
                    addNewContact(name, number);
                    System.out.println("enter 3 to print instructions");
                }
                case 2 -> {
                    System.out.println("Enter name to search: ");
                    String nameEntered = input.nextLine();
                    searchName(nameEntered);
                    System.out.println("enter 3 to print instructions");
                }
                case 3 -> printInstructions();
                case 4 -> printContactList();
                case 5 -> quit = true;
            }
        }


    }
    public static void addNewContact(String name, String number){
        contacts.addNewContact(name, number);
    }

    public static void searchName(String name){
        contacts.searchName(name);
    }

    public static void printContactList(){
        contacts.printContactList();
    }
}