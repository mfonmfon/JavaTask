package Practice;
import java.util.Scanner;

public class BankAccount {
   static Scanner input = new Scanner(System.in);

    private double balance;
    private int pin;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public BankAccount(String firstName, String lastName, String phoneNumber) {
        this.firstName =  firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
    }

    public static void languagePreference(){
        System.out.println("Select your language of preference");
        System.out.println("""
                1-> Yoruba
                2-> Igbo
                3-> Hausa
                4-> Ibibio
                5-> English
                """);
        String languageOptions = input.next();
        switch(languageOptions){
            case "1":yoruba();
            case "2":igbo();
            case "3":hausa();
            case "4":ibibio();
            case "5":english();
        }
    }

    private static void english() {
        mainMenu();
    }
    private static void ibibio() {
        System.out.println("Sorry! The Ibibio language is not up to date on this machine. ");
    }
    private static void hausa() {
        System.out.println("Sorry! The Hausa language is not up to date on this machine. ");
    }
    private static void igbo() {
        System.out.println("Sorry! The Igbo language is not up to date on this machine. ");
    }
    private static void yoruba() {
        System.out.println("Sorry! The Yoruba language is not up to date on this machine. ");
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
        print("Do you want to perform another transactions: ");
        String userResponse = input.next();
    }
    public static void closeAccount() {
    }
    public static String input(String prompt){
       System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        print(scanner.nextLine());
        return scanner.nextLine();
    }
    public static void print(String input){
        System.out.print(input);
    }
    public static void changePin() {
    }
    public static short balance() {

        return 0;
    }
    public  static void transfer() {
    }
    public static void withdraw() {
    }
    public static void deposit() {
    }
    public static void  createAccount() {
         String fullName = input("Enter your full name: ");
         String phoneNumber = input("Enter your phone number: ");
        mainMenu();
    }
    public static void main(String...args){
        mainMenu();
    }
}
