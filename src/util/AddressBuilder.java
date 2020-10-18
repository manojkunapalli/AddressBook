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
        System.out.println("Welcome to Address Book Application");

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
                    addressBuilder.updateAddress();
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
                    addressBuilder.displayAddress();
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
        List<String> list = new ArrayList<>();

        for(int i=0;i<8;i++) {
            switch (i){
                case 0:
                    System.out.println("Enter the Name of Address Book = ");
                    break;
                case 1:
                    System.out.println("Enter the First Name = ");
                    break;
                case 2:
                    System.out.println("Enter the Last Name = ");
                    break;
                case 3:
                    System.out.println("Enter the Address = ");
                    break;
                case 4:
                    System.out.println("Enter the City = ");
                    break;
                case 5:
                    System.out.println("Enter the State = ");
                    break;
                case 6:
                    System.out.println("Enter the zipCode = ");
                    break;
                case 7:
                    System.out.println("Enter the Phone Number = ");
                    break;
            }
            String field = getInput();
            list.add(field);
        }
        addressBook.put(list.get(0),new AddressBook(list.get(1),list.get(2),list.get(3),list.get(4),list.get(5),Integer.parseInt(list.get(6)),list.get(7)));
    }

    @Override
    public void displayAddress() {
        int count = 1;
        for(Map.Entry<String,AddressBook> map : addressBook.entrySet()) {
            System.out.println("Address Book "+count+" Name : "+map.getKey());
            System.out.println(map.getValue());
            count++;
        }
    }

    @Override
    public void updateAddress() {
        System.out.println("Enter the Address book to Update = ");
        String AddressBookName = getInput();
        System.out.println("Enter Field to update ---> \n1.FirstName\n2.LastName\n3.Address\n4.City\n5.State\n6.ZipCode\n7.PhoneNumber\n");
        int opt = input.nextInt();
        switch (opt) {
            case 1:
                System.out.println("Enter the First Name = ");
                addressBook.get(AddressBookName).firstName = getInput();
                break;
            case 2:
                System.out.println("Enter the Last Name = ");
                addressBook.get(AddressBookName).lastName = getInput();
                break;
            case 3:
                System.out.println("Enter the Address = ");
                addressBook.get(AddressBookName).address = getInput();
                break;
            case 4:
                System.out.println("Enter the City = ");
                addressBook.get(AddressBookName).city = getInput();
                break;
            case 5:
                System.out.println("Enter the State = ");
                addressBook.get(AddressBookName).state = getInput();
                break;
            case 6:
                System.out.println("Enter the zipCode = ");
                addressBook.get(AddressBookName).zipCode = Integer.parseInt(getInput());
                break;
            case 7:
                System.out.println("Enter the Phone Number = ");
                addressBook.get(AddressBookName).phoneNumber = getInput();
                break;
        }
    }

    @Override
    public void deleteAddress() {

    }

    public String getInput() {
        return input.next() + input.nextLine();
    }
}
