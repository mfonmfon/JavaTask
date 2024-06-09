package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {

    public static int  printArrays(int[] arrays){
        int sum = 0;
        for(int index = 0; index < arrays.length; index++){
            sum = sum + arrays[index];
        }
        return sum;
    }
    public static void randomArrays(int[] arrays){
        for(int index = 0; index < arrays.length; index++){
            arrays[index] = (int) (Math.random() * 100);
        }
    }
    public static int printMax(int [] arrays){
        int max = 0;
        for(int index = 0; index < arrays.length; index++){
            if(arrays[index] > max){
                max = arrays[index];
            }
        }
        return max;
    }
    public static int printIndexOfLargestElement(int[] arrays){
        int max = 0;
        int indexOfMax = 0;
        for(int index = 0; index < arrays.length; index ++){
            if(arrays[index] > max){
                max = arrays[index];
                indexOfMax = index;
            }
        }
        return indexOfMax;
    }
    public static void shufflingNumbers(int[] swapNumbers) {
        for(int index = 1; index < swapNumbers.length; index--){
            int indexTwo = (int) (Math.random() * (index + 1));
            int swap = swapNumbers[index];
            swapNumbers[index] = swapNumbers[indexTwo];
            swapNumbers[indexTwo] = swap;
        }
    }
    public static void shiftingElementInArrays(int [] myList){
        int temp = 0;
        for(int index = 1; index < myList.length; index++){
            myList[index - 1] = myList[index];
        }
        myList[myList.length - 1] = temp;
    }
    public static void getMonths(){
        String[] month = {"January", "February", "March"};
        System.out.println("Enter your birth month");
        for(String e : month){
            System.out.println(e);
        }
    }
    public static void findTheNumberOfItems() {
        Scanner input = new  Scanner(System.in);
        System.out.println("Enter the number of items ");
        int numberOfItems = input.nextInt();
        int sum = 0;
        int[] items = new int[numberOfItems];
        for(int index = 0; index < items.length; index++){
            System.out.println("Enter number: ");
            items[index] = input.nextInt();
            sum += items[index];
        }
        double average =(double) numberOfItems / sum;
        int counter = 0;
        for(int index  = 0; index < items.length; index ++){
            if(items[index] > average){
                counter++;
            }
        }
        System.out.println(Arrays.toString(items));
        System.out.println("The AVERAGE IS "+ average);
        System.out.println( counter);
    }
        public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int [] result = {1,2,3,4,5,6,7,8,9,1,2,4};
        System.out.println(printArrays(arr));
        randomArrays(result);
        System.out.print(printMax(arr));
        //shufflingNumbers(arr);
            findTheNumberOfItems();
    }
}
