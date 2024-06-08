package Practice;

public class FindTheTranspose {

    public static void findTranspose(int[][] transpose, int col, int rows) {
        int[][] temp = new int[rows][col];
        for (int index = 0; index < col; index++) {
            for (int indexTwo = 0; indexTwo < rows; indexTwo++) {
                temp[index][indexTwo] = transpose[index][index];
                transpose[index][indexTwo] = transpose[indexTwo][index];
                transpose[indexTwo][index] = temp[index][indexTwo];
             }
        }
    }
}