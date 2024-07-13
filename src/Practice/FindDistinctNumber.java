/**package Practice;
import java.util.*;
public class FindDistinctNumber {
    static Scanner input = new Scanner(System.in);


    public static int distinctNumbers(int[] list, int keys){

        int low = 0;

        System.out.println("Enter ten numbers ");
        for(int index = 0; index < list.length-1; index++){
            list[index] = input.nextInt();

            if(keys < list[index]){
                index = index -1;
            }else if(keys == list[index]){
                keys = 1;
            }else{
                keys = +1;
            }
        }
    }
    public static void main(String[] args) {
        //distinctNumbers();
    }

}
**/