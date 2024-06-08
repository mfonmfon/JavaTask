import java.util.*;
public class Calendar {



    ArrayList<String[]> contacts = new ArrayList<String[]>();

    public static void main(String[] args) {
        displayMenu();
    }
    public static void displayMenu(){

        Scanner scan = new Scanner(System.in);
        System.out.println("""
                1-> Add Contact
                2-> Remove Contact
                3-> Find Contact by phone number
                4-> Find Contact by first name
                5-> Find Contact by last name
                0-> exit
                """);
        char choice = scan.next().charAt(0);
        switch (choice){
            case 1: addContact();break;
            case 2: removeContact(); break;
            case 3: findContactByPhoneNumber();break;
            case 4: findContactByFirstName();break;
            case 5: findContactByLastName();break;
            default:
                throw new RuntimeException("Invalid option");
        }
    }

    private static void findContactByLastName() {
    }

    private static void findContactByFirstName() {
    }

    private static void findContactByPhoneNumber() {
    }

    private static void removeContact() {
    }

    private static void addContact() {
       // Calendar myContact = new Calendar();
        //myContact.contacts.add(firstName,lastName,phoneNumber);

        //System.out.println("Enter your first");

    }
}