import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    public void  testStackCanPopElement(){
        stack.push(2);
        stack.push(2);
        stack.push(2);
        assertEquals(3,stack.getSize());
        stack.pop();
        assertEquals(2,stack.getSize());
    }

    @Test
    public void testStackCanSearch(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3,stack.getSize());
        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals(0,stack.getSize());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals(4,stack.search(4));
    }

    @Test
    public void testCanPeek(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(7);
        assertEquals(5,stack.getSize());
        assertEquals(7,stack.peek());
    }
}
