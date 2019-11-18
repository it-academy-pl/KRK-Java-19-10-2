package pl.itacademy.lesson12;

public class ObjectTester {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address krakow = new Address("Krakow", "Szpitalna", 1);
        Person kowalski = new Person("Jan", "Kowalski", krakow);
        System.out.println(kowalski);
        System.out.println(kowalski.hashCode());

        Person janKowalski = new Person("Jan", "Kowalski", krakow);
        System.out.println(kowalski.equals(janKowalski));
        System.out.println(kowalski == janKowalski);
        System.out.println(kowalski.equals(5));
        System.out.println(kowalski.equals(null));

        System.out.println(kowalski.equals(kowalski));
        System.out.println(kowalski.getClass());

        System.out.println("=======================================");
        String test = "test";
        String test2 = "test";
        System.out.println(test.equals(test2));
        //DO NOT repeat at home!!
        System.out.println(test == test2);
        System.out.println(test == new String("test"));

        Integer a = 5;
        Integer b = 5;
        System.out.println(a.equals(b));
        System.out.println(a == b);

        Integer c = 200;
        Integer d = 200;
        System.out.println(c.equals(d));
        System.out.println(c == d);

        //Cloning people
        Person clonnedKowalski = kowalski.clone();
        System.out.println(clonnedKowalski);
        System.out.println(kowalski.getAddress());
        System.out.println(clonnedKowalski.getAddress());
        krakow.setStreet("Pawia");
        System.out.println(kowalski.getAddress());
        System.out.println(clonnedKowalski.getAddress());
        kowalski.setFirstName("Janusz");
        System.out.println(kowalski);
        System.out.println(clonnedKowalski);
    }
}
