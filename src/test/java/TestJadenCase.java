import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestJadenCase {

    JadenCase jadenCase = new JadenCase();

    @Test
    public void test(){
//        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", "Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", "Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
    }
    @Test
    public void testNullArg() {
        assertNull("Must return null when the arg is null", jadenCase.toJadenCase(null));
    }

    @Test
    public void testEmptyArg() {
        assertNull("Must return null when the arg is empty string", jadenCase.toJadenCase(""));
    }

    @Test
    public void test2(){
//        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", "Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", "Most Trees Are Blue", jadenCase.toJadenCase2("most trees are blue"));
    }
    @Test
    public void testNullArg2() {
        assertNull("Must return null when the arg is null", jadenCase.toJadenCase2(null));
    }

    @Test
    public void testEmptyArg2() {
        assertNull("Must return null when the arg is empty string", jadenCase.toJadenCase2(""));
    }

}
