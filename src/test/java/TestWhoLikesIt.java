import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;

public class TestWhoLikesIt {

    @Test
    public void staticTests() {
        assertEquals("no one likes this", WhoLikesIt.whoLikesIt());
        assertEquals("Peter likes this", WhoLikesIt.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

    @Test
    public void staticTests2() {
        assertEquals("no one likes this", WhoLikesIt.whoLikesIt2());
        assertEquals("Peter likes this", WhoLikesIt.whoLikesIt2("Peter"));
        assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesIt2("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesIt2("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesIt2("Alex", "Jacob", "Mark", "Max"));
    }

    @Test
    public void staticTests3() {
        assertEquals("no one likes this", WhoLikesIt.whoLikesIt3());
        assertEquals("Peter likes this", WhoLikesIt.whoLikesIt3("Peter"));
        assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesIt3("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesIt3("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesIt3("Alex", "Jacob", "Mark", "Max"));
    }
}

