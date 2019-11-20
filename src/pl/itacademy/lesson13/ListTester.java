package pl.itacademy.lesson13;

import java.util.LinkedList;
import java.util.List;

public class ListTester {
    public static void main(String[] args) {
        //List<String> strings = new ArrayList<>(30);
        List<String> strings = new LinkedList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Five");
        strings.add("8");

        strings.add(0, "ten");
        strings.set(5, "42");

        for (String string : strings) {
            System.out.println(string);
        }

        List<String> subStrings = strings.subList(0, 3);
        System.out.println("================");
        for (String string : subStrings) {
            System.out.println(string);
        }

        System.out.println(subStrings.get(1));
    }
}
