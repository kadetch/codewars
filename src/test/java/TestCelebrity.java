import org.junit.Test;
import static org.junit.Assert.*;

public class TestCelebrity {

    public Person[] createPersons(int number) {
        Person[] person = new Person[number];
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person(Integer.toString(i));
        }
        person[0].addPerson(person[1]);
        person[0].addPerson(person[2]);
        person[1].addPerson(person[2]);
        person[1].addPerson(person[3]);
        person[3].addPerson(person[2]);
        return person;
    }

    @Test
    public void testPerson() {
        Person[] person = createPersons(4);

        for (int i = 0; i < person.length; i++) {
            assertEquals("Name of person is not " + i, Integer.toString(i), person[i].name);
        }

        assertTrue("Person 1 knows person 2, but get not", person[0].isKnown(person[1]));
        assertTrue("Person 1 knows person 2, but get not", person[0].isKnown(person[2]));
        assertFalse("Person 1 don't knows person 4, but get yes", person[0].isKnown(person[3]));
        assertTrue("Person 2 knows person 4, but get not", person[1].isKnown(person[3]));
        assertTrue("Person 2 knows person 3, but get yes", person[1].isKnown(person[2]));
        assertTrue("Person 4 knows person 3, but get not", person[3].isKnown(person[2]));
        assertFalse("Person 4 knows person 2, but get yes", person[3].isKnown(person[1]));


    }

    @Test
    public void testCelebrity() {
        Integer count = 4;
        Celebrity celebrity = new Celebrity(count);

        assertEquals("", count, celebrity.size());

        Person[] person = createPersons(count);

        celebrity.setGroup(person);
        assertEquals("yyyy", person[2], celebrity.findCelebrity());
        assertEquals("yyyy", person[2], celebrity.findCelebrity(person));
        assertNotEquals("yyyy", person[3], celebrity.findCelebrity(person));
    }
}
