
public class Contacts {

    public static int addNumbers(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public int squared(int num1, int num2 ) {
        return num1*num2;
    }

    public static int divideTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    public char determineLettersGrade(int scores){
         if(scores < 0){
            throw new IllegalArgumentException("Invalid Scores,  Enter a correct scores");
        }
       else if(scores >= 90){
            return 'A';
        }
        else if(scores > 70 || scores == 70){
            return 'B';
        }
        else if(scores == 60 || scores > 60){
            return 'C';
        }
        else {
            return 'F';
        }

    }
    public static int elementInArrays(int[] arrays){
        int max = 0;
        for(int index = 0; index < arrays.length; index++){
            if(arrays[index] > max){
                max = arrays[index];
            }
        }
        return max;
    }

}