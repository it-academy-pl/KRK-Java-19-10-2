package pl.itacademy.lesson14;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        Person kowalski = new Person("Jan", "Kowalski");
        Person nowak = new Person("Janusz", "Nowak");
        Person sereda = new Person("Oleg", "Sereda");
        Person sereda2 = new Person("Oleg", "Sereda");

        Map<Person, String> beerLovers = new LinkedHashMap<>();
        beerLovers.put(kowalski, "ciemne");
        beerLovers.put(nowak, "jasne");
        beerLovers.putIfAbsent(sereda, "bezalkoholowe");
        beerLovers.putIfAbsent(sereda2, "lagger");
        beerLovers.put(kowalski, "kraftowe");

        System.out.println(beerLovers);

        System.out.println(beerLovers.keySet());
        System.out.println(beerLovers.values());

        System.out.println(beerLovers.containsKey(new Person("Jan", "Kowalski")));

        System.out.println(beerLovers.get(kowalski));

        System.out.println(beerLovers.getOrDefault(kowalski, "kraftowe"));
        System.out.println(beerLovers.getOrDefault(new Person("Grzegorz", "Brzezeczikiewicz"), "kraftowe"));

        System.out.println(beerLovers.remove(sereda, "bezalko"));
        System.out.println(beerLovers.get(sereda));

    }
}
