package com.contactmanager;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class AddressBook implements Serializable {
    private HashMap<String, Contact> contacts;

    public AddressBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getEmail())) {
            System.out.println("A contact with this email already exists.");
        } else {
            contacts.put(contact.getEmail(), contact);
            System.out.println("Contact added successfully.");
        }
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("The address book is empty.");
            return;
        }
        for (Contact contact : this.contacts.values()) {
            System.out.println(contact);
        }
    }

    public void searchContact(String email) {
        if (contacts.containsKey(email)) {
            System.out.println(contacts.get(email));
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(String email) {
        if (contacts.containsKey(email)) {
            contacts.remove(email);
            System.out.println("Contact deleted.");
        } else {
            System.out.println("No contact found with the provided email.");
        }
    }

    public void storeContacts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("contacts.dat"))) {
            oos.writeObject(contacts);
            System.out.println("Contacts saved to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving contacts: " + e.getMessage());
        }
    }

    public void loadContacts() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("contacts.dat"))) {
            contacts = (HashMap<String, Contact>) ois.readObject();
            System.out.println("Contacts loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred while loading contacts: " + e.getMessage());
        }
    }
}
