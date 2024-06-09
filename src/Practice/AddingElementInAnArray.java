package Practice;

import java.util.Arrays;

public class AddingElementInAnArray{

    public static int[] addArrays(int[] arrays, int numbers , int sum ){
        int[] newArrays = new int[numbers + 1];
        for(int index = 0; index <  numbers; index++){
            newArrays[index] = arrays[index];
            newArrays[numbers] = sum ;
            return  newArrays;
        }
    return newArrays;
    }
    public static void main(String[] args) {
        int num = 10;
        int[] arrays = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arrays));
        int sax = 50;


    }

}