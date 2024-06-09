package Practice;

public class AddingTwoMatrices{

    public static void addingTwoArrays(int[][] arrays){
        for(int index = 0; index < arrays.length; index++){
            for(int indexTwo = 0; indexTwo < arrays.length; indexTwo++){
                System.out.println(arrays[index][indexTwo]);
            }
        }
    }
    public static int[][] addingArrays(int[][] firstArrays, int[][] secondArrays, int size){
        int[][] resultArrays = new int[size][size];
        for(int index = 0; index < size; index++){
            for(int indexTwo = 0; indexTwo < size; indexTwo++){
                resultArrays[index][indexTwo] = firstArrays[index][indexTwo] + secondArrays[index][indexTwo];

            }
        }
        return resultArrays;
    }

}