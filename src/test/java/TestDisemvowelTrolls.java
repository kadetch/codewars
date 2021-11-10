import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
//import org.junit.Assert;

public class TestDisemvowelTrolls {

    @Test
    public void test() {
        String text1 = "This website is for losers LOL!";
        assertTrue("Text1 is not removes vowels.", DisemvowelTrolls.
                getWithoutVowels(text1).equals("Ths wbst s fr lsrs LL!"));

        String text2 = "This text fo testing you!";
        assertTrue("Text2 is not removes vowels.", DisemvowelTrolls.
                getWithoutVowels(text2).equals("Ths txt f tstng y!"));

        assertEquals("cVcSW[]kLZyKrmrsyPj", DisemvowelTrolls.
                getWithoutVowels("cVcSW[i]kLZyKrmrsyPj"));
    }
}
