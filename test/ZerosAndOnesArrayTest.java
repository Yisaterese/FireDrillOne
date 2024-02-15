import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZerosAndOnesArrayTest {

    @Test
    void returnArrayOfZerosAndOnes() {
        int[] array = {7,2,32,4,5,7,5,3};
        int[] myArray = ZerosAndOnesArray.returnArrayOfZerosAndOnes(array);
        int[] expected = {1,0,0,0,1,1,1,1};
        assertArrayEquals(expected, myArray);
    }
}