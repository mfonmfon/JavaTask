package Practice;
import  java.util.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Regular {
    static ArrayList<String[]> items = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int pin;

    public Regular(String firstName, String lastName, String phoneNumber, int pin){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
    }
    public static void regular(){

        System.out.println("Enter first name: ");
        String firstName = input.next();
        System.out.print("Enter last name");
        String  lastName  = input.next();
        System.out.println("Enter phoneNumber");
        String phoneNumber = input.next();
        System.out.println("Enter a strong pin");
        String pin = input.next();
        if (pin.charAt(0) >= 4) {
            System.out.println("Strong password");
        } else {
            System.out.println("Enter a strong password");
        }
        String[] items ={firstName, lastName, phoneNumber};
        for(int index = 0; index < items.length; index++) {
                System.out.print((items[index] + " "));
            }
    }
    public static void main(String... args){
    regular();
    }
}
