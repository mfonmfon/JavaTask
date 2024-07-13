package Practice;

import java.util.Scanner;

public class PrintDistinctNumbers {
    static Scanner input = new Scanner(System.in);
    public static void printDistinctNumbers(){
        int[] numbers = new int[10];
        for(int index = 0; index < numbers.length; index++){
            System.out.println("Enter 10 numbers: ");
            numbers[index] = input.nextInt();
        }
    }
}
