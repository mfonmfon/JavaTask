package ClassWork;
import java.util.Arrays;
public class AddElement {

    public static int[] addElement(int[]arrays){
        int[] newArrays = new int[arrays.length];
        for(int index = 0; index < arrays.length; index++){
           newArrays[index] += arrays[index];
        }
       return newArrays;
    }

    public static void main(String[] args) {
        int [] result = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(addElement(result)));
    }
}
