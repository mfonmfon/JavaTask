package ClassWork;
import java.util.Scanner;
public class ArrayPractice {

    public static void analyzingNumbers(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of items");
        int  numbers = scan.nextInt();
        double[] arrays = new double[numbers];
        double sum = 0;

        System.out.println("Enter any numbers");
        for(int index = 0; index < arrays.length; index++){
            arrays[index] = scan.nextDouble();
            sum += arrays[index];
        }

        double average = sum / numbers;
        int counter = 0;
        for(int index = 0; index < numbers; index++){
            if(arrays[index] > average){
                counter++;
            }

        }
        System.out.println("The total average is "+ average);
        System.out.println("The total count is " + counter);

    }
    public static void main(String[] args) {
        analyzingNumbers();
    }
}
