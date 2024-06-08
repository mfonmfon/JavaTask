package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReversedArrays {
    static Scanner userInput = new Scanner(System.in);
    public static int reverseNumbers(int [] numbers){
        //int[] newArrays = new int[10];
        int reversed = 0;
        for(int index = 0; index < numbers.length; index++){
            reversed = numbers[index];
            numbers[index] = reversed;

        }
        return 0;
    }
    public static void main(String... args){
        int[] result = {12,2,3,4};
        reverseNumbers(result);
    }
}
