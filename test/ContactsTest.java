import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactsTest {

    @Test
    public void checkThatNumbersCanBeAdded(){
        Contacts contactList = new Contacts();
        int result = contactList.addNumbers(9,5);
        Assertions.assertEquals(14, result);
    }
    @Test
    public void checkThatNumbersAreSquared(){
        Contacts contactList = new Contacts();
        int squareResult = contactList.squared(5, 4);
        Assertions.assertEquals(20,squareResult);
    }
    @Test
    public void checkThatNumbersAreDividedByThree(){
        Contacts contactList = new Contacts();
        assertEquals(15, contactList.divideTwoNumbers(45,3));
    }
    @Test
    public void checkThatNinetyFiveShouldBeA(){
        Contacts contactLists = new Contacts();
        Assertions.assertEquals('A', contactLists.determineLettersGrade(95) );
    }
    @Test
    public void checkThatThirtyThreeIsF(){
        Contacts contactLists = new Contacts();
        Assertions.assertEquals('F', contactLists.determineLettersGrade(33));
    }
    @Test
    public void checkThatFiftyNineIsD(){
        Contacts contactList = new Contacts();
        Assertions.assertEquals('F', contactList.determineLettersGrade(59));
    }
    @Test
    public void checkThatHundredIsA(){
        Contacts contactLists = new Contacts();
        Assertions.assertEquals('A', contactLists.determineLettersGrade(100));
    }
    @Test
    public void checkThatSeventyNineIsC(){
        Contacts contactLists = new Contacts();
        Assertions.assertEquals('B', contactLists.determineLettersGrade(79));
    }
    @Test
    public void checkThatTwentyIsF(){
        Contacts contactList = new Contacts();
        Assertions.assertEquals('F', contactList.determineLettersGrade(20));
    }
    @Test
    public void checkThatNegativeNumberThrowsAnExceptions(){
        Contacts contactLists = new Contacts();
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> {
            contactLists.determineLettersGrade(-1);
        });
    }
}