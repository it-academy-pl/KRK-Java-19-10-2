package pl.itacademy.lesson7;

public class PrimeNumbersPrinter {
    public static void main(String[] args) {
        System.out.print("Prime numbers: " + 2 + " ");
        for (int i = 3; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static boolean isPrime(int number) {
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
