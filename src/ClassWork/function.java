package ClassWork;

import java.util.Arrays;

public class function {
    //functions that collect an arrays from 11-20
    //returns an arrays of the odd numbers
    public static int[] functionsToPrintOddNumbers(int[] arrays){
        int oddNumber = 0;
        int[] newArrays = new int[arrays.length / 2];
        for(int index  = 0; index < arrays.length; index++){
            if(arrays[index] % 2 != 0){
                newArrays[oddNumber] = arrays[index];
                oddNumber++;
            }
        }
        return newArrays;
    }
    public static int[] addNumbersInAnArray(int[] addingArrays, int sum) {
        int[] newArrays = new int[addingArrays.length];
        for (int index = 0; index < addingArrays.length; index++) {
            newArrays[ sum] += addingArrays[index];
        }
        return newArrays;
    }
    public static void main(String[] args) {
        int[] result = {11,12,13,14,15,16,17,18,19,20};
        System.out.println(Arrays.toString(functionsToPrintOddNumbers(result)));
        //System.out.println(addNumbersInAnArray(result));
    }

}

