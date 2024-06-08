package Practice;

public class SortingArrays {

   /** public static void mergeTwoArrays(){
        int[] firstArrays = new int[3];
        int[] secondArrays = new int[3];
        int [] result = new int[0];
        for(int index = 0; index < firstArrays.length; index++){
            for(int indexTwo = 0; indexTwo < secondArrays.length; indexTwo++){

            }
        }
        System.out.println(result);
    }*/
   public static int[] addingArrays(int[] arrays){
       int[] newArrays = new int[arrays.length];
       int sum = 0;
       for(int index = 0; index < arrays.length; index++){
           newArrays[index] += arrays[index];
       }
       return arrays;
   }

    public static void main(String[] args) {
       int [] arrays = {1,2,3,4,5,6,7,8,9,10};
        //swappingNumbers(1,3,4,5,6,7,8,9);
       //System.out.println(binarySearch(56,3,23,24,542,3,4,3,2));
       int numbers = arrays.length;
       int sum = 0;
       for(int index = 0; index < numbers; index++){
           sum = sum + arrays[index];
       }
       System.out.println(sum);
    }
   /**
    * public static void checkArrays(){
    * char[] arrays = new char[100];
    * for(int index = 0; index < arrays.length; index++){
    * arrays[arrays[index]  - "a"]++;
    * }
    * }
    */
   public static int linearSearch(int[] arrays, int key){
       for(int index = 0; index < arrays.length; index++){
           if(key == arrays[index]){
               return index;
           }
               return -1;
       }
       return key;
   }

   public static int binarySearch(int[] array, int key){
       int high = array.length;
       int low = 0;
       for(int  index = 0; index < high; index++){
           int middle = (low + high)/2;
           if(key < array[middle]){
               high = middle -1;
           }else if(key == array[middle]){
               return middle;
           }else {
               low = middle + 1;
           }

       }
       return -1;
   }

   public static void swappingNumbers(int[] arrays){
       int index = 0;
       int indexTwo = 0;
       int currentMinIndex = 0;
       int currentMin = 0;
       for(index = 0; index < arrays.length-1; index++ ) {
           currentMin = arrays[index];
           currentMinIndex = index;


           for (indexTwo = 0; indexTwo < arrays.length; indexTwo++) {
               currentMin = arrays[indexTwo];
               currentMinIndex = indexTwo;


           }
       }
       if (currentMinIndex != indexTwo) {
           arrays[currentMinIndex] = arrays[index];
           arrays[index] = currentMin;

       }
   }
}
