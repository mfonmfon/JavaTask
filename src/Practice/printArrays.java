package Practice;

import java.util.Arrays;

public class printArrays {

   public static void  printArrays(int[][] arrays){
       for(int index = 0; index < arrays.length; index++){
           for(int indexTwo = 0; indexTwo < arrays[index].length; indexTwo++){
               System.out.println((arrays[index][indexTwo]));
           }
       }
    }

    public static void main(String[] args) {
        int[][]  arr ={{1,2,3,4,5,6,7,8,9,10}};
        printArrays(arr);
    }
}
