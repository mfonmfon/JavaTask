package ClassWork;

import java.util.Arrays;

public class ReversedInput {
    public static String[] reverseInput() {
        String temp;
        String[] arrays = new String[10];
        String[] newArrays = new String[10];
       for(int index = 0; index < arrays.length;){
           for(int indexTwo = 0; indexTwo < arrays.length;){
               temp = arrays[index];
               arrays[index] = newArrays[indexTwo];
               newArrays[indexTwo] = temp;
           }
       }
       return newArrays;
    }
    public static void main(String[] args) {
       System.out.println(Arrays.toString(reverseInput()));
    }
}
