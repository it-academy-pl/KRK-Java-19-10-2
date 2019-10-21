package pl.itacademy.lesson5;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] numbers = new int[args.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        if(numbers.length > 0) {
            int max = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (max < numbers[i]) {
                    max = numbers[i];
                }
            }
            System.out.printf("The maximum number is: %d\n", max);
        }
    }
}
