package pl.itacademy.lesson12;

public class FinalizeTester {
    public static void main(String[] args) {
        //DO NOT repeat at home
        for (int i = 0; i < 100_000; i++) {
            Address address = new Address("Krakow", "Focha", i);
        }
    }
}
