package pl.itacademy.lesson15;

import java.util.Collection;

public class Util {

    public static <T extends Number> boolean compare(T first, T second) {
        return first.equals(second);
    }

    public static <T extends Number> T getOrDefault(T a, T b) {
        if (a != null) {
            return a;
        } else {
            return b;
        }
    }

    public static <T extends Number> T max(T a, T b) {
        if (a.doubleValue() > b.doubleValue()) {
            return a;
        } else {
            return b;
        }
    }

    public static void printCollection(Collection<?> collection) {
        System.out.println(collection);
    }

    public static void sendAnimalsToSleep(Collection<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.sleep();
        }
    }

    public static void addAnimalsToCollection(Collection<? super Animal> animals, Animal animal) {
        animals.add(animal);
    }

    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o);
        }
    }

    static <T> boolean isEqual(T first, T second) {
        return first.equals(second);
    }

    static <T> boolean isEqualBox(Box<T> firstBox, Box<T> secondBox) {
        return firstBox.getItem().equals(secondBox.getItem());
    }
}
