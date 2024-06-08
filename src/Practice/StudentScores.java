package Practice;
import java.util.Scanner;
public class StudentScores {

    public static void main(String[] args) {
       // checkForTheTotalNumberOfStudent();
    }
   static Scanner userInput = new Scanner(System.in);

    public static void checkForTheTotalNumberOfStudent(int[] grades){
        for(int index = 0; index < grades.length; index++){
            System.out.println("Enter the number of student :");
            grades[index] = userInput.nextInt();
            System.out.println("Enter " + grades[index] + " scores");

            if(index >= grades[index]){
                System.out.println("Student " + index + " Scores is  " + grades[index] + " and grades is " + "4");
            } else if(index >= grades[index]){
                System.out.println("Student " + index + " Scores is  " + grades[index] + " and grades is " + "B");
            }else if(index >= grades[index]){
                System.out.println("Student " + index + " Scores is  " + grades[index] + " and grades is " + "C");
            }else{
                System.out.println("Grades is F ");
            }
        }
    }
}
