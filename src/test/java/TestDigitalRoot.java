import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDigitalRoot {
    @Test
    public void testSumOfDigital(){
        assertEquals("", (int) 7, DigitalRoot.getSumOfDigital(7));
        assertEquals("", (int) 7, DigitalRoot.getSumOfDigital(16));
        assertEquals("", (int) 6, DigitalRoot.getSumOfDigital(942));
        assertEquals("", (int) 6, DigitalRoot.getSumOfDigital(132189));
        assertEquals("", (int) 2, DigitalRoot.getSumOfDigital(493193));
    }

    @Test
    public void testDigitalRoot(){
        assertEquals("", (int) 7, DigitalRoot.digitalRoot(7));
        assertEquals("", (int) 7, DigitalRoot.digitalRoot(16));
        assertEquals("", (int) 6, DigitalRoot.digitalRoot(942));
        assertEquals("", (int) 6, DigitalRoot.digitalRoot(132189));
        assertEquals("", (int) 2, DigitalRoot.digitalRoot(493193));
    }

    @Test
    public void testDigital_Root(){
        assertEquals("", (int) 7, DigitalRoot.digital_root(7));
        assertEquals("", (int) 7, DigitalRoot.digital_root(16));
        assertEquals("", (int) 6, DigitalRoot.digital_root(942));
        assertEquals("", (int) 6, DigitalRoot.digital_root(132189));
        assertEquals("", (int) 2, DigitalRoot.digital_root(493193));
    }
}
