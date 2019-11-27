package pl.itacademy.lesson15;

import pl.itacademy.lesson14.Person;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GeneriksTester {
    public static void main(String[] args) {
        List integers = new ArrayList();
        integers.add(5);
        integers.add("java");
        integers.add(new Person("Jan", "Kowalski"));

        for (Object element : integers) {
            if (element instanceof Integer) {
                Integer i = (Integer) element;
            } else if (element instanceof String) {
                String s = (String) element;
            }
            //Person p = (Person) element;
        }

        List<String> strings = new ArrayList<>();

        Box<Integer> integerBox = new Box<>(10);
        Integer item = integerBox.getItem();
        System.out.println(item);

        boolean result = Util.compare(5, 6);
        System.out.println(result);

        Number number = Util.getOrDefault(5, 6);
        System.out.println(number);
        Number number2 = Util.getOrDefault(null, 6);
        System.out.println(number2);

        System.out.println("====================================");
        System.out.println(Util.max(5, 6));
        System.out.println(Util.max(5.9, 6));
        System.out.println(Util.max(10L, 0xAA));
        System.out.println(Util.max(BigDecimal.valueOf(5), 0xFFF));

        BasketOfNumbers numbers = new BasketOfNumbers();
        numbers.addNumber(5);
        numbers.addNumber(0xAA);
        numbers.addNumber(1001);
        numbers.addNumber(5.01);

        numbers.printBasket();

        Collection<Integer> integers1 = new ArrayList<>();
        integers1.add(1);
        integers1.add(2);
        Util.printCollection(integers1);

        List<String> strings1 = new ArrayList<>();
        strings1.add("first");
        strings1.add("second");
        Util.printCollection(strings1);

        Cat tom = new Cat();
        Cat thomas = new Cat();
        List<Animal> cats = new ArrayList<>();
        cats.add(tom);
        cats.add(thomas);
        Util.sendAnimalsToSleep(cats);

        Lion lion = new Lion();
        Lion lion2 = new Lion();
        List<Lion> lions = new ArrayList<>();
        lions.add(lion);
        lions.add(lion2);
        Util.sendAnimalsToSleep(lions);

        List<Animal> animals = new ArrayList<>();
        Util.addAnimalsToCollection(animals, new Tiger());
        Util.addAnimalsToCollection(animals, new Lion());
        Util.addAnimalsToCollection(animals, new Cat());

        Util.sendAnimalsToSleep(animals);

        Integer[] integerArray = {1, 2, 3};
        Collection<Integer> integerCollection = new ArrayList<>();
        Util.fromArrayToCollection(integerArray, integerCollection);
        System.out.println(integerCollection);

        Util.isEqual("test", 5);

        Box<Integer> boxWithInteger = new Box<>(42);
        Box<Integer> anotherBoxWithInteger = new Box<>(42);
        Box<String> boxWithString = new Box<>("Test");

        //Won't compile
        //Util.isEqualBox(boxWithInteger, boxWithString);

        //Compiles OK
        Util.isEqualBox(boxWithInteger, anotherBoxWithInteger);

    }
}
