import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayOfTrueAndFalseTest {
    @Test
    public void testArrayCanReturnTrueAtOddElementsAndFalseAtEvenElements(){
        int[] myArray = {1,2,3,4,5,6,};
        boolean[] expected = {true,false,true,false,true,false,};
        assertArrayEquals(expected,ArrayOfTrueAndFalse.returnTrueAtoddAndFalseAtEvenElement(myArray));
    }
}
