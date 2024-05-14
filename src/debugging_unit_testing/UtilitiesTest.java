package debugging_unit_testing;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertArrayEquals;


public class UtilitiesTest {

    private Utilities utilities;
    @Before
    public void setup(){
        utilities = new Utilities();
    }

    @Test
    public void everyNthChar() throws Exception{
        char[] arrayOutput = utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l','o'}, 2);
        assertArrayEquals(new char[] {'e', 'l'}, arrayOutput) ;
        char[] arrayOutput2 = utilities.everyNthChar(new char[] {'b', 'u', 'n', 'd', 'a'}, 6);
        assertArrayEquals(new char[] {'b', 'u', 'n', 'd', 'a'}, arrayOutput2);
    }

    @Test
    public void removePairs() throws Exception{
        Utilities utilities =  new Utilities();
        assertEquals( "ABCDEF", utilities.removePairs("AABCDDEFF"));
        assertEquals( "ABCABDEF", utilities.removePairs("ABCCABDEF"));
        assertEquals("A", utilities.removePairs("AA"));
        assertNull("It wasn't null", utilities.removePairs(null));
    }

    @Test
    public void converter() throws Exception{
        Utilities utilities =  new Utilities();
        assertEquals(300, utilities.converter(10,5));
    }

    @Test (expected = ArithmeticException.class)
    public void converter_exception() throws Exception{
        Utilities utilities =  new Utilities();
        utilities.converter(10,0);
    }

    @Test
    public void nullIfOddLength() throws Exception{
        Utilities utilities = new Utilities();
        assertNull(utilities.nullIfOddLength("ASD"));
        assertNotNull(utilities.nullIfOddLength("AS"));
        assertEquals("AA", utilities.nullIfOddLength("AA"));
    }
}
