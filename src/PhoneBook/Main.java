package PhoneBook;

public class Main {
    public static void main(String[] args) {
        Contacts vasya = new Contacts("Vasiliy","254354354","test@mail.ru");
        Contacts saha = new Contacts("Aleksandr","5453435345","test@mail.ru");
        Contacts vanya = new Contacts("Ivan","5354545435","test@mail.ru");
        Contacts misha = new Contacts("Mykhail","5435435435","test@mail.ru");
        Contacts petya = new Contacts("Petr","43543543654","test@mail.ru");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addcontact(vasya);
        phoneBook.addcontact(saha);
        phoneBook.addcontact(vanya);
        phoneBook.addcontact(misha);
        phoneBook.addcontact(petya);

        System.out.println(phoneBook.searchContact("Vasiliy"));
        phoneBook.deleteContact("Vasiliy");
        //после удаления василия мы можем убедится что его нету в списке наших контактов
        for(Contacts con : phoneBook.contacts){
            System.out.println(con);
        }
        System.out.println(phoneBook.editContact("Aleksandr","Pavel"));
    }
}
