package DataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {

    @Test
    public void testThatMyListHasSize(){
        MyList element = new MyList();
        assertEquals(3, element.size());
    }
    @Test
    public void testThatMyList_isNotEmpty(){
        MyList element = new MyList();
        element.add("Mfon");
        assertEquals(0, element.get(0));
    }
    @Test
    public void testThatMyList_isEmpty(){
        MyList element = new MyList();
        assertTrue(element.isEmpty());
    }
    @Test
    public void testThatMyListCanAddElement(){
        MyList  element = new MyList();
        element.add("Mfon");
        element.add("Paul");
        assertEquals(2,element.get(0));
    }

    @Test
    public void testThatMyListCanRemoveElement(){
        MyList element = new MyList();
        element.add("Mfon");
        element.add("Paul");
        element.remove("Mfon");
        assertEquals(element, element.get(0));
    }
}