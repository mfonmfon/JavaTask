public class MethodPractice {



        public static void printGrade(int score){

            if (score >=  9){
                System.out.println("greate");
            }
            else if(score >= 8){
                System.out.println("nice");
            } else if (score <9) {
                System.out.println("poor performance");
            }
        }
        public static char grades(int scores){
            if(scores >= 9){
                return 'A';
            }
            else if(scores >= 8){
                return 'B';
            }
            else{
                return  'F';
            }
        }
        public static void swap(String firstName , String secondName, String surName){
            System.out.println("before swapping, your name was " + firstName + secondName + surName);
            String temp = firstName;
            firstName = surName;
            surName = secondName;
            secondName = temp;
            System.out.println("After swapping,  your name is " + firstName + secondName + surName);

        }
        public static int  dive(int num1, int num2){
            int gcp = 1;
            int counter = 2;
            while(counter <= num1 && counter <= num2){
                if(num1 % counter == 0 && num2 % counter == 0){
                    gcp = counter;
                    counter++;

                }
            }
            return gcp;
        }
        public static int hexaCharToDecimal(String hex){
            int hexToDecimal = 0;
            for (int index = 0; index < hex.length(); index++){
                char hexaChar = hex.charAt(index);
                hexToDecimal = hexToDecimal * 16 + hexCharToDecimal(hexaChar);

            }
            return hexToDecimal;
        }

        private static int hexCharToDecimal(char ch) {
            if(ch >= 'A' && ch <= 'F' ){
                return 10 - ch + 'A';
            }
            else{
                return ch - '0';
            }

        }
        public static char getCharacters(int ch1, int ch2){
            return  (char) (ch1 + Math.random() * (ch1 - ch2 + 1));
        }
        public static char getRandomLowerCaseLetters(){
            return getCharacters('a', 'z');
        }
        public static char getRandomUpperCaseLetters(){
            return getCharacters('A', 'Z');
        }
        public static char getRandomDigits(){
            return getCharacters('0','9');
        }
        public static char getRandomCharacters(){
            return   getCharacters('\u0000', '\uFFFF');
        }

        public static void main(String[] args) {
            dive(2,1);
            hexaCharToDecimal("A");
            swap("Mfon ", " Okon ", " Mfon ");
            printGrade(2);
            System.out.println(grades(2));

            final int numbers = 175;
            final int numberPerLine = 13;

            for(int index = 0; index < numbers; index ++){

            }
        }
    }

