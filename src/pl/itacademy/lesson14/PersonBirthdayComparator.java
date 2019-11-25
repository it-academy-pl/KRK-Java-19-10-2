package pl.itacademy.lesson14;

import java.util.Comparator;

public class PersonBirthdayComparator implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        return first.getBirthDay().compareTo(second.getBirthDay());
    }
}
