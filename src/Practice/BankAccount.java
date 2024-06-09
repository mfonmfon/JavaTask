package Practice;
import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    BankAccount userAccount = new BankAccount();
   static Scanner input = new Scanner(System.in);
   static ArrayList<String[]> customerAccount = new ArrayList<>();
    private double balance;
    private int pin;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public  BankAccount(){
        this.pin = pin;
         this.firstName =  firstName;
         this.lastName = lastName;
         this.phoneNumber = phoneNumber;
    }

    public static void mainMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Banke Bank");
        System.out.println("""
                1 -> Create Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5 -> Balance
                6 -> Change pin
                7 -> Close Account
                0 -> Exit
                """);
        String options = input.next();

        switch(options){
            case "1": createAccount(); break;
            case "2": deposit(); break;
            case "3": withdraw(); break;
            case "4": transfer(); break;
            case "5": balance(); break;
            case "6": changePin(); break;
            case "7": closeAccount(); break;
            case "0": exit(); break;
        }
    }
    public static void exit() {
        System.out.print("Do you want to perform another transactions: ");
        String userResponse = input.next();
        if(userResponse.equals("yes")){
            mainMenu();
        }else{
            System.out.println("Thank you for using our service: ");
        }
    }
    public static void closeAccount() {
    }
    public static void changePin() {
    }
    public static void balance() {
        System.out.print("Enter your pin: ");
        String pin = input.next();
    }
    public  static void transfer() {
    }
    public static void withdraw() {
    }
    public static void deposit() {
    }
    public static void createAccount() {
        System.out.print("Enter your first name: ");
         String firstName = input.next();
        System.out.print("Enter your last name: ");
         String lastName = input.next();
        System.out.print("Please Enter your phone number: ");
         String phoneNumber = input.next();
        String[] customerAccount = {firstName, lastName, phoneNumber};
        for(int index = 0; index < customerAccount.length; index++){
        }
        mainMenu();
    }
    public static void main(String...args){
        mainMenu();
    }
}
