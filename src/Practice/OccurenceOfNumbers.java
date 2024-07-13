package Practice;

import java.util.Scanner;

public class OccurenceOfNumbers {

    static Scanner input = new Scanner(System.in);

    public static void occurence(){
        int[] arrays = new int[100];
        int index = 1;
        System.out.println("Enter numbers between 1-100");
        for(; index < arrays.length; index++) {
            for (int indexTwo = 0; indexTwo < arrays.length; indexTwo++) {
                arrays[index] = input.nextInt();
                if((index % 10 == 0)){
                    arrays[index] = index;
                }
      System.out.println(arrays[index] + " Occurred " + indexTwo + " times");
            }
        }
        }
    public static void main(String[] args) {
        occurence();
    }
}
