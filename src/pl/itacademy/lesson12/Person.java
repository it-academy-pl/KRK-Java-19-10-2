package pl.itacademy.lesson12;

import java.util.Objects;

public class Person implements Cloneable {
    private String firstName;
    private String lastName;
    private Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + address;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof Person) {
//            Person another = (Person) obj;
//            return this.firstName.equals(another.firstName) &&
//                    this.lastName.equals(another.lastName);
//        }
//        return false;
//    }

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
        return firstName.length() + lastName.length();
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person clone =  (Person) super.clone();
        clone.address = address.clone();
        return clone;
    }
}
