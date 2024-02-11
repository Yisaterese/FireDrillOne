import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private MyStack stack;
    @BeforeEach
    public void setUp(){
        stack = new MyStack();
    }

    @Test
    public void testStackIsEmpty(){
        assertTrue(stack.isEmpty());

    }
    @Test
    public void stackCanPushTest(){
        stack.push(2);
        stack.push(2);
        stack.push(2);
        assertEquals(3,stack.getSize());
    }
    @Test
    public void stackCanPopElement(){
        stack.push(2);
        stack.push(2);
        stack.push(2);
        assertEquals(3,stack.getSize());
        stack.pop();
        assertEquals(2,stack.getSize());
    }
}
