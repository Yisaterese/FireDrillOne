import java.util.Arrays;

public class ZerosAndOnesArray {

    public static int[] returnArrayOfZerosAndOnes(int[] array) {
            for (int index = 0; index < array.length; index++) {
                array[index] = array[index] % 2;
            }
        return array;


    }
}