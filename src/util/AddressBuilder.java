package util;

import java.util.*;

public class AddressBuilder implements AddressOperations {

    private Map<String,AddressBook> addressBook;
    static Scanner input;
    public AddressBuilder() {
        addressBook = new HashMap<>();
        input = new Scanner(System.in);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        AddressBuilder addressBuilder = new AddressBuilder();

        boolean exitCode = false;
        while(!exitCode) {
            System.out.println("Please choose the option : \n1.Create\n2.Update\n3.Delete\n4.Sort By Name\n5.Sort By Zip Code\n6.Display\n7.Exit\nOption => ");
            int option = input.nextInt();
            switch(option) {
                case 1 :
                    System.out.println("Create Address Book..............");
                    addressBuilder.createAddress();
                    break;
                case 2 :
                    System.out.println("Update Address Book..............");
                    break;
                case 3 :
                    System.out.println("Delete Address Book..............");
                    break;
                case 4 :
                    System.out.println("Sort By Name : Address Book..............");
                    break;
                case 5 :
                    System.out.println("Sort By ZipCode : Address Book..............");
                    break;
                case 6 :
                    System.out.println("Display Address Book..............");
                    addressBuilder.readAddress();
                    break;
                case 7 :
                    System.out.println("Back to Home");
                    exitCode = true;
                    break;
            }
        }

    }

    @Override
    public void createAddress() {
        System.out.println("Enter the Name of Address Book = ");
        String addressBookName = input.nextLine();
        System.out.println("Enter the First Name = ");
        String firstName = input.nextLine();
        System.out.println("Enter the Last Name = ");
        String lastName = input.nextLine();
        System.out.println("Enter the Address = ");
        String address = input.nextLine();
        System.out.println("Enter the City = ");
        String city = input.nextLine();
        System.out.println("Enter the State = ");
        String state = input.nextLine();
        System.out.println("Enter the zipCode = ");
        int zipCode = input.nextInt();
        System.out.println("Enter the phone Number = ");
        String phoneNumber = input.nextLine();

        addressBook.put(addressBookName,new AddressBook(firstName,lastName,address,city,state,zipCode,phoneNumber));
    }

    @Override
    public void readAddress() {
        int count = 1;
        for(Map.Entry<String,AddressBook> map : addressBook.entrySet()) {
            System.out.println("Address Book 1 : "+map.getKey());
            System.out.println(map.getValue());
        }
    }

    @Override
    public void updateAddress() {

    }

    @Override
    public void deleteAddress() {

    }
}
