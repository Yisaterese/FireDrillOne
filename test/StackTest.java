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
        assertEquals(2,stack.getSize());
        stack.push(4);
        stack.push(5);
        assertEquals(4,stack.search());
    }
}
