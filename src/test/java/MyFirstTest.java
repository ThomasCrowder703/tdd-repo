import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
public class MyFirstTest {

    @Test
    public void testIfNameIsEqual(){
        String expected = "Codeup";
        String actual ="CodeUp";

        assertEquals(expected,actual); //test fails because they are not equal
    }

    @Test
    public void testIfArrayListIsEqual(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages,moreLanguages); //test passed because they are NOT the same.
    }

    @Test
    public void testIfArrayEquals(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers,otherNumbers); //test passes because array values/indexes match
    }

    @Test
    public void testIfFalseOrTrue(){
        String language = "PHP";
//        language.contains("H"); // use assertTrue for this statement
//        language.contains("J"); // use assertFalse for this statement

        assertTrue(language.contains("H")); //passes because true
        assertFalse(language.contains("J")); //passes because false
//        assertTrue(language.contains("T")); //fails because false
    }
}
