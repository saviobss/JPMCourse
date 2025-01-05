package list_arraylist_linkedlist_itetrator_autoboxing;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact) == -1) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if(findContact(oldContact) != -1) {
            myContacts.remove(findContact(oldContact));
            myContacts.add(newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        if(findContact(contact) != -1) {
            myContacts.remove(findContact(contact));
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
            return findContact(contact.getName());
    }

    private int findContact(String contactName) {
        for(Contact contact : this.myContacts) {
            if(contact.getName().equals(contactName)) {
                return this.myContacts.indexOf(contact);
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName) {
        if(findContact(contactName) != -1) {
            return this.myContacts.get(findContact(contactName));
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for(Contact contact:this.myContacts) {
            System.out.printf("%d. %s -> %s%n", this.myContacts.indexOf(contact) + 1 ,contact.getName(), contact.getPhoneNumber());
        }
    }
}
