package Practice;
import java.util.Scanner;
public class StudentScores {

    public static void main(String[] args) {
       checkForTheTotalNumberOfStudent();
    }
   static Scanner userInput = new Scanner(System.in);

    public static void checkForTheTotalNumberOfStudent(){
        System.out.println("Enter the number of student ");

        int numberOfStudent = userInput.nextInt();
        int maximum = 100;
        int[] scores = new int[numberOfStudent];
        System.out.print("Enter "+ numberOfStudent + " scores " );
        for(int index  = 0; index < scores.length; index++) {
            scores[index] = userInput.nextInt();
        }
        for(int numbers = 0; numbers < scores.length; numbers++){
            if (scores[numbers] >= maximum - 10) {
                System.out.println("student " + numbers + " score is " + scores[numbers] + " and grade is A");
            } else if (scores[numbers] >= maximum -20) {
                System.out.println("student "+ numbers + " score is " + scores[numbers] + " and grade is B");
            }else if(scores[numbers] >= maximum -30){
                System.out.println("student "+ numbers + " score is " + scores[numbers] + " and grade is C");
            }else if(scores[numbers] >= 40){
                System.out.println("student "+ numbers + " score is " + scores[numbers] + " and grade is D");
            }else {
                System.out.println("student "+ numbers + " score is " + scores[numbers] + " and grade is F");
            }

        }
    }
}
