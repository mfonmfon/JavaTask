package Practice;

import java.util.Arrays;

public class FirstsTask {
    //input [5,10,20,15]
    //output [20]

    public static int checkForTheMaximum(int[] arrays){
        int maximum = 0;

        for(int index = 0; index < arrays.length; index++){
            if(arrays[index] > maximum){
                maximum = arrays[index];
            }
        }
        return maximum;
    }
    public static int findMinimum(int[] arrays){
        int minimum = arrays[2];
        for(int index = 0; index < arrays.length; index++){
            if(arrays[index] < minimum){
                minimum = arrays[index];
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        int[] numbers = {12,10,20,50};
        System.out.println(checkForTheMaximum(numbers));
        System.out.println(findMinimum(numbers));
    }
}
