package pl.itacademy.lesson18;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTester {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .filter(number -> number > 5)
                .mapToInt(number -> number * number)
                .sum();
        System.out.println(sum);

        long count = numbers.stream()
                .peek(System.out::println)
                .filter(number -> number > 5)
                .peek(System.out::println)
                .count();
        System.out.println(count);

        System.out.println("=====================================");
        Stream streamForNumbers = numbers.stream()
                .map(number -> number * 2);

        long c = streamForNumbers.count();
        System.out.println(c);

        List<Person> people = List.of(
                new Person("Jan", "Kowalski"),
                new Person("Ola", "Nowak"),
                new Person("Grzegorz", "Brzezeczikiewicz")
        );

        List<String> lastNames = people.stream()
                .map(person -> person.getLastName())
                .collect(Collectors.toList());
        System.out.println(lastNames);
    }
}
