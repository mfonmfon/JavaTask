package InterfacePractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListsTest {

    @Test
    public void testThatIsEmpty(){
        MyArrayLists list = new MyArrayLists();
        list.isEmpty();
        assertFalse(list.isEmpty());
    }
    @Test
    public void testThatMyArrayList_notEmpty(){
        MyArrayLists list = new MyArrayLists();
        list.isEmpty();
        assertTrue(list.isEmpty());
    }
}