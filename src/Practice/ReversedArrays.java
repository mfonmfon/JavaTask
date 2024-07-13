package Practice;
public class ReversedArrays {


    public static void main(String[] args) {
        int [] arrays = {1,2,3,4,5,6,7,8,9,10};

        for(int index = 0; index < arrays.length; index++){
            System.out.println( arrays[index]);
        }
        for (int index = arrays.length-1; index > 0 ; index--){
            System.out.println( arrays[index]);

        }
    }
}

