import java.util.ArrayList;
import java.util.List;
/**
 * Поиск знаменитости. Метод двух указателей
 * Условия: Дана группа персон (К). Персоны знают других персон (от одного и более).
 *          Знаметитостью является та персона, о которой знают все остальные персоны
 *          в группе, а она не знает никого.
 */
public class Celebrity {
    public void setGroup(Person[] group) {
        this.group = group;
    }

    private Person[] group;

    public Celebrity(Integer countPersons) {
        this.group = new Person[countPersons];
        for (int i = 0; i < countPersons; i++) {
            group[i] = new Person(Integer.toString(i + 1));
        }
    }

    public Integer size() {
        return group.length;
    }

    public Person findCelebrity() {
        int l = 0;
        int r = group.length - 1;
        while (l != r) {

            if (group[l].isKnown(group[r])) {
                l++;
            } else {
                r--;
            }
        }
        for (int i = 0; i < group.length; i++) {
            if ((i != l) &&
                    (!group[i].isKnown(group[l]) ||
                            group[l].isKnown(group[i]))) {
                return null;
            }
        }
        return group[l];
    }

    public Person findCelebrity(Person[] persons) {
        group = persons;
        return findCelebrity();
    }
}

class Person {
    public String name;

    private final List<Person> known = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    void addPerson(Person person) {
        if (!known.contains(person))
            known.add(person);
    }

    boolean isKnown(Person person) {
        return known.contains(person);
    }
}