package Practice;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.Scanner;

public class AnalyseScores {
static Scanner input = new Scanner(System.in);

    public static void analyzeNumber(){
        int sum = 0;
        System.out.println("Enter the numbe of student :");
        int noOfStudent = input.nextInt();
        int[] scores = new int[noOfStudent];
        System.out.println("Enter the number of scores :");
        for(int index = 0; index < scores.length; index++){
            scores[index] = input.nextInt();
            sum += scores[index];
        }
        int count = 0;
        double average = (double) sum /noOfStudent;
        for(int index = 0; index < scores.length; index++){
            if(scores[index] >= average ){
                count++;
            }
            System.out.print(scores[index] + " ");
        }
    }
    public static void main(String[] args) {
        analyzeNumber();
    }
}