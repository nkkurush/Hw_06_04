package PhoneBook;

import java.util.Calendar;

public class PhoneBook {
    Contacts[] contacts = new Contacts[100];
    public PhoneBook(){}

    public Contacts[] getContacts() {
        return contacts;
    }

    public void setContacts(Contacts[] contacts) {
        this.contacts = contacts;
    }

    public void addcontact(Contacts contact) {
        for(int i=0; i<contacts.length; i++){
            if(contacts[i]==null){
                contacts[i] = contact;
                break;
            }
        }
    }
    public Contacts searchContact(String nameOfContanct){
        for(int i=0; i<contacts.length; i++){
            if(contacts[i]!=null) {
                if (contacts[i].getName().equals(nameOfContanct)) {
                    return contacts[i];
                }
            }
        }
        return null;
    }
    public void deleteContact(String nameOfSearch){
        for(int i=0; i<contacts.length; i++){
            if(contacts[i].getName()==nameOfSearch){
                contacts[i]=null;
                break;
            }
        }
    }
    //
    public Contacts editContact(String searchName,String newNameOfContact){
        if(searchContact(searchName)!=null){
            for(int i=0; i<contacts.length; i++){
                if(contacts[i]!=null){
                    if(contacts[i].getName().equals(searchName)){
                        contacts[i].setName(newNameOfContact);
                        return contacts[i];
                    }
                }
            }
        }
        return null;
    }
}
