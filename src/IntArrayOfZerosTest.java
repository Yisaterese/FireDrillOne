import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IntArrayOfZerosTest {
    @Test
    public void fillArrayWithZeros(){
        int[] myArray = new int[10];
        int[] method = IntArrayOfZeros.arrayOfZeros(myArray);
        int[] expected = {0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(expected, method);
    }
}
