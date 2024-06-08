/**import java.util.Random;

public class MasteringArrays {

    public static char[] createArrays(){
        char[] charArrays = new char[100];
        for(int index = 0; index < charArrays.length; index++){
            Object RandomCharacters = 0;
//            charArrays[index] = RandomCharacters.getRandomLowerCaseCharacters();
        }
        return charArrays;
    }

    public static void displayArrays(char[] charArrays){
        int[] arr = new int[10];
        for (int index = 0; index < charArrays.length; index++) {
            arr[charArrays[index] - 'a']++;
        }
    }
    public static int[] arrayCounter(char[] arrays) {
        for (int index = 0; index < arrays.length; index++) {
            if ((index + 1) % 20 == 0) {
                System.out.println(arrays[index]);
            } else {
                System.out.println(arrays[index] + " ");
            }
        }
        //return new int[0];
    }
}*/
