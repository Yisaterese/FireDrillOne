
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class StateTest {
    @Test
    public void testCanValidateStateFromUser(){
        State state = new State();
        assertEquals(6,state.getGeoPoliticalZones());
        //System.out.print(Arrays.toString(state.getGeoPoliticalZone()));
    }
}
