import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MyArrayListTest {
    private MyArrayList arrayList;
    @BeforeEach
    public void setUp(){
        arrayList = new MyArrayList();
    }
    @Test
    public void testArrayListISEmpty_arrayListIsEmpty(){
        assertFalse(arrayList.getIsEmpty());
    }

    @Test
    public void testArrayListCanAddElements(){
        assertFalse(arrayList.getIsEmpty());
        arrayList.add(2);
        arrayList.add(3);
        assertEquals(2,arrayList.length());
    }


    @Test
    public void testArrayListCanRemoveElements(){
        assertFalse(arrayList.getIsEmpty());
        arrayList.add(2);
        arrayList.add(1);
        arrayList.remove(2);
        assertEquals(1,arrayList.length());
    }




}
