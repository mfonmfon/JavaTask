package Practice;

import java.util.Arrays;

public class FindArraysOfEvenNumbers {

    //input[4,5,1,2]
    //out
    public static int[] findAnArraysOfEvenNumbersAndReturnTheDoubleOfTheNumbers(int[] arrays){

        int [] newArrays = new int[arrays.length / 2];
        int count = 0;
        for(int index = 0; index < arrays.length; index++){
            if (arrays[index] % 2 == 0){
                int twiceArrays = arrays[index] * 2;
                newArrays[count] = twiceArrays;
                count++;
            }
        }
        return  newArrays;
    }
    public static void main(String[] args) {
        int[] numbers = {4,5,1,2};
        String output = Arrays.toString(findAnArraysOfEvenNumbersAndReturnTheDoubleOfTheNumbers(numbers));
        System.out.println(output);
    }
}
