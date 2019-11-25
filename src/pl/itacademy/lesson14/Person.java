package pl.itacademy.lesson14;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private LocalDate birthDay;

    public Person(String firstName, String lastName, LocalDate birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = LocalDate.now();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public int compareTo(Person another) {
        int result = lastName.compareTo(another.lastName);
        if (result == 0) {
            return firstName.compareTo(another.firstName);
        }
        return result;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }
}
