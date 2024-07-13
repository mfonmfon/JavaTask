public class RotatingArrays {

    public static int[] rotate(int[] numbers){
        int temp = 0;
        int size = numbers.length;
        for(int index = 1; index < size; index++){
            numbers[index-1] = numbers[index];
        }
        numbers[size-1] = temp;
        return numbers;
    }
}
