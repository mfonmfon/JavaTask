public class ArrayTask {

    public static int[] multiplyArray(int [] array){
        int product = 2;
        int[] newArray = new int[array.length];
        for(int index = 0; index < array.length; index++){
            newArray[index] = array[index] * product;
        }
        return newArray;
    }
    public static int[] doubleArrays(int[] arrays){
        int sumUp = 2;
        int[] newArray = new int[arrays.length];
        for(int index = 0; index < arrays.length; index++){
            newArray[index] = arrays[index] * sumUp;
        }
        return newArray;
    }
    public double[] sumUpArrays(double[] arrays) {
        double result = 2;
        double[] newArrays = new double[arrays.length];
        for (int index = 0; index < arrays.length; index++){
            newArrays[index] = arrays[index] + result;
        }
        return newArrays;
    }
}
