import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTaskTest {
    @Test
    public void testThatArrayCanBeMultiply(){
        ArrayTask task = new ArrayTask();
        int[] arr = {2, 3, 5, 2, 5, 3};
        int[]  result = ArrayTask.multiplyArray(arr);
        int[] expectedValue = {4, 6, 10, 4, 10, 6};
        assertArrayEquals(expectedValue, result);

    }
    @Test
    public void testThatArraysCanBeMultiplyByThree(){
        ArrayTask task = new ArrayTask();
        int[] arrays = {1,2,3,4,5};
        int[] expected = task.doubleArrays(arrays);
        int[] value = {2,4,6,8,10,};
        Assertions.assertArrayEquals(value,expected);
    }
    @Test
    public void testThatArraysCanBeAdded(){
        ArrayTask task = new ArrayTask();
        double[] arr ={1, 3, 4, 5};
        double[] val = task.sumUpArrays(arr);
        double[] expectedValue = {3.0, 5.0, 6.0, 7.0};
        Assertions.assertArrayEquals(expectedValue,val);
    }

}