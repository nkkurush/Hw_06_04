package PhoneBook;

public class Contacts {
    String name;
    String email;
    String phoneNumber;
    public Contacts(){
    }
    public Contacts(String name,String phoneNumber,String email){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}