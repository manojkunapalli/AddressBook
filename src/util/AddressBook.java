package util;

public class AddressBook {
    String firstName,lastName,address,city,state,phoneNumber;
    int zipCode;

    public AddressBook(String firstName,String lastName,String address,String city,String state,int zipCode,String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "*********Address Book************"+
                "\n First Name : "+getFirstName()+
                "\n Last Name : "+getLastName()+
                "\n Address : "+getAddress()+
                "\n city : "+getCity()+
                "\n state : "+getState()+
                "\n zip code : "+getZipCode()+
                "\n phone number : "+getPhoneNumber()+"\n";
    }

}
