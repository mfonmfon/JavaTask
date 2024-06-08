//public class Human {
////Write a function that validate Login
//// 1) it must have a pin and userName
////2)  it check if pin is correct
//    Human myHuman = new Human();
//  private  String accountBalance;
//  private  int userPin = 1234;
//  public Human(){
//  }
//  public int TheUserAccountPin(int pin){
//      this.userPin = userPin;
//      return userPin;
//  }
//  public void userPin(){
//      if(){
//
//      }
//  }
//}
import java.util.Scanner;

import java.util.ArrayList;

public class Human {
    private String firstName;
    private String lastName;
    private String phoneNumber;



    ArrayList<String[]> contacts = new ArrayList<String[]>();

    public static  void createContacts (){
        System.out.println( """
                1 -> Add Contact
                2 -> Remove Contact
                3 -> Find Contact by phone number
                4 -> Find Contact by first name
                5 -> Find Contact by last name
                0 -> Exit Contact
                """);


    }
    public static void addAccount(String firstName, String lastName, String phoneNumber) {
        Human myContactList = new Human();
        Scanner scan = new Scanner(System.in);
        String[] contacts = {firstName, lastName, phoneNumber};
        myContactList.contacts.add(contacts);

    }
    public static void userInput(){
        String firstName = prompt("First Name: ");
        String lastName = prompt("Last Name: ");
        String phoneNumber = prompt("Phone Number: ");
    }
    public static String prompt(String input ){
        Scanner scan = new Scanner(System.in);
        input = scan.next();
        return  input;
    }

    public static void main(String[] args) {
        createContacts ();
    }

}
