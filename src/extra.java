//import java.util.*;
//
//interface Book {
//    void createAddress(AddressBook addressObj);
//    void displayAddress(List<AddressBook> list);
//    void deleteAddress();
//    void updateAddress();
//}
//public class AddressBook implements Book {
//    private String id;
//    private String name;
//    private String cityName;
//    private String address;
//    private String phoneNumber;
//    private String zipCode;
//    AddressBook addressObj;
//
//    public AddressBook getAddressObj() {
//        return addressObj;
//    }
//
//    public void setAddressObj(AddressBook addressObj) {
//        this.addressObj = addressObj;
//    }
//
//    private List<AddressBook> list = new ArrayList<>();;
//
//    public List<AddressBook> getList() {
//        return list;
//    }
//
//    public void setList(List<AddressBook> list) {
//        this.list = list;
//    }
//
//    public AddressBook(String id,String name,String cityName,String address,String phoneNumber,String zipCode){
//        this.id = id;
//        this.name = name;
//        this.cityName = cityName;
//        this.address = address;
//        this.phoneNumber = phoneNumber;
//        this.zipCode = zipCode;
//    }
//
//    @Override
//    public String toString(){
//        return "\nid = "+id+" name = "+name+" CityName = "+cityName+" Address = "+address+" PhoneNumber = "+phoneNumber+" ZipCode = "+zipCode;
//    }
//
//    @Override
//    public void createAddress(AddressBook address) {
//        list.add(address);
//        setList(list);
//    }
//
//    @Override
//    public void displayAddress(List<AddressBook> list) {
//        if(list.size() == 0) {
//           System.out.println("Your Address  book  is Empty ");
//        } else {
//            for(AddressBook ob : list) {
//                System.out.println(ob);
//            }
//        }
//    }
//
//    @Override
//    public void deleteAddress(){
//
//    }
//
//    @Override
//    public void updateAddress(){
//
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println("****************************Welcome to Address Book**********************\n");
//        Scanner input = new Scanner(System.in);
//        System.out.println("Select the Option.....\n");
//        System.out.println("1.Create\n2.Update\n3.Delete\n4.Sort by name\n5.Sort by ZipCode\n6.Display\n");
//        AddressBook obj;
//        int option = input.nextInt();
//        switch(option) {
//            case 1 :
//                System.out.print("Enter the ID : ");
//                String pId = input.nextLine();
//                System.out.print("Enter the Name : ");
//                String pName = input.nextLine();
//                System.out.print("Enter the City Name : ");
//                String pCityName = input.nextLine();
//                System.out.print("Enter the Address : ");
//                String pAddress = input.nextLine();
//                System.out.print("Enter the Phone Number : ");
//                String pPhoneNum = input.nextLine();
//                System.out.print("Enter the zip code : ");
//                String pZipCode = input.nextLine();
//
//                obj = new AddressBook(pId,pName,pCityName,pAddress,pPhoneNum,pZipCode);
//                obj.setAddressObj(obj);
//                obj.createAddress(obj);
//                break;
//            case 2 :
//                break;
//            case 3 :
//                break;
//            case 4 :
//                break;
//            case 5 :
//                break;
//            case 6 :
//
//                obj.displayAddress();
//                break;
//        }
//
//
//
//
//
//
//
//
//
//
//    }
//
//
//}
